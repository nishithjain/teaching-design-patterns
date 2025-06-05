#pragma once
#include <unordered_map>
#include <string>
#include <memory>
#include "Intern.h"

class InternRegistry {
   std::unordered_map<std::string, std::unique_ptr<Intern>> registry_;

public:
   void Register(const std::string& key, std::unique_ptr<Intern> prototype);
   [[nodiscard]] std::unique_ptr<Intern> create(const std::string& key) const;
};
