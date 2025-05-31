#pragma once
#include <string>

class Player {
public:
   virtual ~Player() = default;
   virtual void print() const;
   virtual Player* clone() const;
   Player(const std::string& name, int health, int damage);
   Player() = default;
   std::string name_ = "";
   int health_ = 0;
   int damage_ = 0;
};













