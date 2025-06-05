#include "InternRegistry.h"
#include <iostream>

void InternRegistry::Register(const std::string& key,
                              std::unique_ptr<Intern> prototype){
   registry_[key] = std::move(prototype);
}

std::unique_ptr<Intern> InternRegistry::create(const std::string& key) const {
   if (const auto it = registry_.find(key); it != registry_.end()) {
      return it->second->clone();
   }
   return nullptr;
}