#include "pch.h"
#include "CarFactory.h"

#include "Car.h"

std::unique_ptr<Vehicle> CarFactory::CreateVehicle() const
{
   return std::make_unique<Car>();
}

std::string CarFactory::GetVehicleName() const
{
   return "Car";
}

extern "C" __declspec(dllexport) VehicleFactory* CreateFactory() {
   return new CarFactory();
}