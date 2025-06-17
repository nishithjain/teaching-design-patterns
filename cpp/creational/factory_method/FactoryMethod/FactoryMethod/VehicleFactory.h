 #pragma once
#include <memory>
#include <string>
#include "Vehicle.h"

class VehicleFactory {
public:
   [[nodiscard]] virtual std::unique_ptr<Vehicle> CreateVehicle() const = 0;
   [[nodiscard]] virtual std::string GetVehicleName() const = 0;
   virtual ~VehicleFactory() = default;
};