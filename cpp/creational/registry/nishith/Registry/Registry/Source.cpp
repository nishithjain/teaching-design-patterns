#include <iostream>

#include "BusinessAnalystIntern.h"
#include "DefaultInternsInitializer.h"
#include "InternKeys.h"
#include "InternRegistry.h"
void print_intern_details(const std::unique_ptr<Intern>& intern) {
  std::cout << "\n---------------- INTERN DETAILS ----------------\n";
  std::cout << "Name             : " << intern->get_name() << "\n";
  std::cout << "Email            : " << intern->get_email() << "\n";
  std::cout << "Age              : " << intern->get_age() << "\n";
  std::cout << "Gender           : " << intern->get_gender() << "\n";
  std::cout << "University       : " << intern->get_university_name() << "\n";
  std::cout << "Phone Number     : " << intern->get_phone_number() << "\n";

  if (const auto batch = intern->get_batch_info()) {
    std::cout << "Batch Name       : " << batch->name << "\n";
    std::cout << "Start Date       : " << batch->start_date << "\n";
    std::cout << "End Date         : " << batch->end_date << "\n";
    std::cout << "Duration         : " << batch->duration << "\n";
    std::cout << "Location         : " << batch->location << "\n";
  }

  // Try dynamic_cast to see if it's a BA intern
  if (const auto ba = dynamic_cast<BusinessAnalystIntern*>(intern.get())) {
    std::cout << "Domain Interest  : " << ba->domain_interest() << "\n";
    std::cout << "Tools Known      : " << ba->tools_known() << "\n";
    std::cout << "Data Sources     : " << ba->data_sources_used() << "\n";
    std::cout << "Deliverables     : " << ba->deliverables() << "\n";
  }

  std::cout << "------------------------------------------------\n";
}
int main() {
  InternRegistry registry;
  // Decoupled Object Creation with Registry
  register_default_interns(registry);

  // Clone
  const auto new_eng_intern = registry.create(intern_key::engineering);
  std::cout << "Cloned Engineering Intern Batch: "
            << new_eng_intern->get_batch_info()->name << '\n';
  {
    new_eng_intern->set_name("Nishith");
    new_eng_intern->set_email("write2nishi@eng.com");
    new_eng_intern->set_age(43);
    new_eng_intern->set_gender("Male");
    new_eng_intern->set_university_name("SIT Tumkur");
    new_eng_intern->set_phone_number("9999912345");
  }

  const auto new_ba_intern = registry.create(intern_key::business_analyst);
  std::cout << "Cloned BA Intern Batch: "
            << new_ba_intern->get_batch_info()->name << '\n';
  if (auto* ba = dynamic_cast<BusinessAnalystIntern*>(new_ba_intern.get())) {
    ba->set_name("Bob");
    ba->set_email("bob@ba.com");
    ba->set_age(23);
    ba->set_gender("Male");
    ba->set_university_name("IIM Bangalore");
    ba->set_phone_number("8888843210");

    ba->set_domain_interest("Retail Analytics");
    ba->set_tools_known("Excel, Power BI");
    ba->set_data_sources_used("Retail DB, Surveys");
    ba->set_deliverables("Weekly sales dashboard");
  }

  print_intern_details(new_eng_intern);
  print_intern_details(new_ba_intern);
  return 0;
}
