#pragma once
#include "Intern.h"

class EngineeringIntern final : public Intern {
public:
   EngineeringIntern() = default;

   [[nodiscard]] std::unique_ptr<Intern> clone() const override;
   [[nodiscard]] std::string get_name() const override;
};
