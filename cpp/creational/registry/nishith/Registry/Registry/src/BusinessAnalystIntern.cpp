#include "BusinessAnalystIntern.h"

std::string BusinessAnalystIntern::data_sources_used() const
{
   return data_sources_used_;
}

std::string BusinessAnalystIntern::deliverables() const
{
   return deliverables_;
}

std::string BusinessAnalystIntern::domain_interest() const
{
   return domain_interest_;
}

std::string BusinessAnalystIntern::tools_known() const
{
   return tools_known_;
}

void BusinessAnalystIntern::set_domain_interest(const std::string& interest)
{
   domain_interest_ = interest;
}

void BusinessAnalystIntern::set_tools_known(const std::string& tools)
{ tools_known_ = tools; }

void BusinessAnalystIntern::set_data_sources_used(const std::string& sources)
{
   data_sources_used_ = sources;
}

void BusinessAnalystIntern::set_deliverables(const std::string& deliverables)
{
   deliverables_ = deliverables;
}

std::unique_ptr<Intern> BusinessAnalystIntern::clone() const {
   return std::make_unique<BusinessAnalystIntern>(*this);
}

std::string BusinessAnalystIntern::get_name() const {
   return name_;
}