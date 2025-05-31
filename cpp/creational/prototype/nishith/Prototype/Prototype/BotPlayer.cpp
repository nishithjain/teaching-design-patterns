#include "BotPlayer.h"
#include <iostream>

BotPlayer::BotPlayer(const std::string& name, int health, int damage, int bot_level)
   : Player(name, health, damage), bot_level_(bot_level)
{

}

Player* BotPlayer::clone() const
{
   return new BotPlayer(*this);
}

void BotPlayer::print() const
{
   std::cout << "BotPlayer: " << name_ << ", Health: " << health_
      << ", Damage Output: " << damage_
      << ", Bot Level: " << bot_level_ << std::endl;
}