#include "pch.h"

#include <iostream>
#include <memory>

#include "Vehicle.h"
#include "VehicleFactory.h"

class MonsterTruck final : public Vehicle {
public:
   void Drive() const override {
      std::cout << "Driving MonsterTruck\n";
   }
};

class MonsterTruckFactory : public VehicleFactory {
public:
   std::unique_ptr<Vehicle> CreateVehicle() const override {
      return std::make_unique<MonsterTruck>();
   }
   std::string GetVehicleName() const override {
      return "MonsterTruck";
   }
};

extern "C" __declspec(dllexport) VehicleFactory* CreateFactory() {
   return new MonsterTruckFactory();
}
