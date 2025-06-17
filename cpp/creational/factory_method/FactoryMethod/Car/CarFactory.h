#pragma once
#include "VehicleFactory.h"

class CarFactory : public VehicleFactory
{
public:
   [[nodiscard]] std::unique_ptr<Vehicle> CreateVehicle() const override;
   [[nodiscard]] std::string GetVehicleName() const override;
};

