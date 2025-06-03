#include "Player.h"
#include <iostream>


void Player::print() const
{
   std::cout << "Player: " << name_ << ", Health: " << health_
      << ", Damage Output: " << damage_ << std::endl;
}

Player* Player::clone() const  
{  
  return new Player(*this);  
}

Player::Player(const std::string& name, int health, int damage)
   : name_(name), health_(health), damage_(damage)
{
}
