#include "DefaultInternsInitializer.h"
#include "InternKeys.h"
#include "BatchInfo.h"
#include "BusinessAnalystIntern.h"
#include "EngineeringIntern.h"

using namespace std;

void register_default_interns(InternRegistry& registry) {
  // Create Batch for Engineering Interns
  const auto eng_batch = std::make_shared<BatchInfo>();
  eng_batch->name = "2025-ENG";
  eng_batch->start_date = "2025-06-01";
  eng_batch->end_date = "2025-12-01";
  eng_batch->duration = "6 months";
  eng_batch->location = "Bangalore";

  auto engineering_intern = std::make_unique<EngineeringIntern>();
  engineering_intern->set_batch_info(eng_batch);
  registry.Register(intern_key::engineering, std::move(engineering_intern));

  // Create Batch for Business Analyst Interns
  const auto ba_batch = std::make_shared<BatchInfo>();
  ba_batch->name = "2025-BA";
  ba_batch->start_date = "2025-07-01";
  ba_batch->end_date = "2025-11-30";
  ba_batch->duration = "5 months";
  ba_batch->location = "Hyderabad";

  auto new_ba_intern = std::make_unique<BusinessAnalystIntern>();
  new_ba_intern->set_batch_info(ba_batch);
  registry.Register(intern_key::business_analyst, std::move(new_ba_intern));
}
