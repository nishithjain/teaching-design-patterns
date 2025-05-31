#pragma once
#include "Player.h"
class RealPlayer : public Player
{
public:
   RealPlayer(const std::string& name, int health, int damage);
   Player* clone() const override;
   void print() const;
};

