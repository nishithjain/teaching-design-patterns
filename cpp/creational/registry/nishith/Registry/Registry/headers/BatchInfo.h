#pragma once
#include <string>
class BatchInfo {
public:
    // Constructors and Destructor
    BatchInfo() = default;
    ~BatchInfo() = default;
    BatchInfo(const BatchInfo&) = default;
    BatchInfo(BatchInfo&&) noexcept = default;
    // Assignment Operators
    BatchInfo& operator=(const BatchInfo&) = default;
    BatchInfo& operator=(BatchInfo&&) noexcept = default;
    // Member Variables
    std::string name;
    std::string start_date;
    std::string end_date;
    std::string duration;
    std::string location;
};
