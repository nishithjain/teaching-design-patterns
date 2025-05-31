#pragma once
#include "Player.h"
class BotPlayer : public Player
{
   int bot_level_;
public:
   BotPlayer(const std::string& name, int health, int damage, int bot_level);
   Player* clone() const;
   void print() const override;
};

