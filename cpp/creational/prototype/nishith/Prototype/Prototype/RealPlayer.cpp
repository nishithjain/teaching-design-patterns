#include "RealPlayer.h"
#include <iostream>

RealPlayer::RealPlayer(const std::string& name, int health, int damage)
   : Player(name, health, damage)
{

}

void RealPlayer::print() const
{
   std::cout << "RealPlayer: " << name_ << ", Health: " << health_
      << ", Damage Output: " << damage_ << std::endl;
}

Player* RealPlayer::clone() const
{
   return new RealPlayer(*this);
}