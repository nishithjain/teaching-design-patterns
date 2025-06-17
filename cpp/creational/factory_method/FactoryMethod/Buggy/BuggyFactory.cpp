#include "pch.h"
#include <iostream>

#include "Vehicle.h"

#include <memory>

#include "VehicleFactory.h"

class Buggy final : public Vehicle {
public:
   void Drive() const override {
      std::cout << "Driving Buggy\n";
   }
};

class BuggyFactory : public VehicleFactory {
public:
   std::unique_ptr<Vehicle> CreateVehicle() const override {
      return std::make_unique<Buggy>();
   }
   std::string GetVehicleName() const override {
      return "Buggy";
   }
};

extern "C" __declspec(dllexport) VehicleFactory* CreateFactory() {
   return new BuggyFactory();
}
