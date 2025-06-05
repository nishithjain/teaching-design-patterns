#include "EngineeringIntern.h"

std::unique_ptr<Intern> EngineeringIntern::clone() const {
   return std::make_unique<EngineeringIntern>(*this);
}

std::string EngineeringIntern::get_name() const {
   return name_;
}