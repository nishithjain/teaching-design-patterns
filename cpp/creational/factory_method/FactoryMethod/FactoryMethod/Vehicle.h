#pragma once
class Vehicle {
public:
   virtual void Drive() const = 0;
   virtual ~Vehicle() = default;
};