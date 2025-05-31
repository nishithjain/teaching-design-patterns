#include <iostream>
#include "Player.h"
#include "BotPlayer.h"
#include "RealPlayer.h"

using namespace std;

// This is bad - Why?
Player* cloneNaive(Player* original) {
   Player* copy = nullptr;
   if (dynamic_cast<BotPlayer*>(original)) {
      copy = new BotPlayer(*dynamic_cast<BotPlayer*>(original));
   }
   else if (dynamic_cast<RealPlayer*>(original)) {
      copy = new RealPlayer(*dynamic_cast<RealPlayer*>(original));
   }
   return copy;
}
/*
Use the Prototype pattern when:
   Object creation is costly (e.g., time-consuming or resource-intensive).
   Player* boss = new Player("bot_player.obj", "bot_player.anim", "bot_player_ai.json");
      Internally:
      - Reads large model file
      - Loads textures
      - Parses behavior trees
      - Allocates memory for skeletal animation
      - Initializes physics components

   You need many similar objects with small variations.
      Imagine a game with lots of BotPlayer enemies. Most Bots share the same base stats, but:
         - Some have different outfits (camouflage, armor, etc.)
         - Some carry different guns (pistol, sniper, Machine Gun, Assault rifle)
         - Some have slightly different damage values or health points

   You want to avoid exposing the class internals to clients.
      std::string name = player.getName();
      int health = player.getHealth();
      int damage = player.getDamage();
      Player copy(name, health, damage);
   
   You want to copy objects without knowing their concrete types.
*/

Player* clone(Player* original) {
   if (original == nullptr) {
      return nullptr;
   }
   return original->clone();
}

int main()
{
   { // Naive Copying — Manual Member-wise Assignment
      Player player("SoleMortal", 100, 50); // Too much amout of time for creation
      Player playerCopy;
      playerCopy.name_ = player.name_;
      playerCopy.health_ = player.health_;
      playerCopy.damage_ = player.damage_;
   }
   //{ // Using Copy Constructor
   //   BotPlayer botPlayer("Bot1", 100, 20, 7);

   //   Player* basePtr = &botPlayer;
   //   basePtr->print();

   //   Player playerCopy = *basePtr;
   //   playerCopy.print();
   //}

   {
      BotPlayer botPlayer("Bot1", 100, 20, 7); // Expnsive to create
      botPlayer.print();

      Player* playerCopy1 = clone(&botPlayer);
      Player* playerCopy2 = clone(&botPlayer);
      Player* playerCopy3 = clone(&botPlayer);
      Player* playerCopy4 = clone(&botPlayer);
      Player* playerCopy5 = clone(&botPlayer);

      playerCopy1->print();
   }

   return 0;
}

