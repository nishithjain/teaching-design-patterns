#include <Windows.h>
#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include "VehicleFactory.h"  // Must be shared with consumer app

std::vector<std::string> ReadConfig(const std::string& filename) 
{
   std::vector<std::string> dlls;
   std::ifstream file(filename);

   if (!file.is_open()) {
      std::cerr << "Failed to open config file: " << filename << '\n';
      return dlls;
   }

   std::string line;
   while (std::getline(file, line)) {
      if (!line.empty()) {
         dlls.push_back(line);
      }
   }

   file.close();
   return dlls;
}

using CreateFactoryFunc = VehicleFactory * (*)();

std::vector<std::unique_ptr<VehicleFactory>>
LoadVehicleFactories(const std::vector<std::string>& dlls) 
{
   std::vector<std::unique_ptr<VehicleFactory>> factories;

   for (const auto& dll : dlls) {
      const HMODULE handle = LoadLibraryA(dll.c_str());
      if (!handle) continue;

      if (const auto create_factory = (CreateFactoryFunc)GetProcAddress(handle, "CreateFactory")) {
         factories.emplace_back(create_factory());
      }
   }

   return factories;
}

int main() {
   const auto dlls = ReadConfig("vehicles.config"); // read list of DLLs
   const auto factories = LoadVehicleFactories(dlls);

   for (const auto& factory : factories) {
      const auto vehicle = factory->CreateVehicle();
      vehicle->Drive();
   }

   return 0;
}
