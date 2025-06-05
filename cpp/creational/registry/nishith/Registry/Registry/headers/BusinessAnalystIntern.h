#pragma once
#include "Intern.h"

class BusinessAnalystIntern final : public Intern {
   std::string domain_interest_;
  std::string tools_known_;
  std::string data_sources_used_;
  std::string deliverables_;

 public:
  BusinessAnalystIntern() = default;

  [[nodiscard]] std::unique_ptr<Intern> clone() const override;
  [[nodiscard]] std::string get_name() const override;

  [[nodiscard]] std::string data_sources_used() const;
  [[nodiscard]] std::string deliverables() const;
  [[nodiscard]] std::string domain_interest() const;
  [[nodiscard]] std::string tools_known() const;

  void set_domain_interest(const std::string& interest);
  void set_tools_known(const std::string& tools);
  void set_data_sources_used(const std::string& sources);
  void set_deliverables(const std::string& deliverables);
};