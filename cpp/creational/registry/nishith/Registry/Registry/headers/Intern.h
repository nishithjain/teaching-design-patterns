#pragma once
#include <memory>
#include <string>
#include "BatchInfo.h"
class Intern {
protected:
    std::string name_;
    int age_ = 0;
    std::string university_name_;
    std::string gender_;
    std::string phone_number_;
    std::string email_;
    std::shared_ptr<BatchInfo> batch_info_;
public:
    // Virtual destructor ensures proper cleanup of derived classes
    virtual ~Intern() = default;
    // Rule of five: Default implementations for copy/move constructors and assignment operators
    Intern() = default;
    Intern(const Intern&) = default;
    Intern& operator=(const Intern&) = default;
    Intern(Intern&&) = default;
    Intern& operator=(Intern&&) = default;
    // Pure virtual methods for cloning and retrieving the intern's name
    [[nodiscard]] virtual std::unique_ptr<Intern> clone() const = 0;
    [[nodiscard]] virtual std::string get_name() const = 0;
    // Accessor methods
    [[nodiscard]] int get_age() const { return age_; }
    [[nodiscard]] std::shared_ptr<BatchInfo> get_batch_info() const { return batch_info_; }
    [[nodiscard]] std::string get_email() const { return email_; }
    [[nodiscard]] std::string get_gender() const { return gender_; }
    [[nodiscard]] std::string get_phone_number() const { return phone_number_; }
    [[nodiscard]] std::string get_university_name() const { return university_name_; }
    // Mutator methods
    void set_name(const std::string& name) { name_ = name; }
    void set_age(const int age) { age_ = age; }
    void set_university_name(const std::string& university_name) { university_name_ = university_name; }
    void set_gender(const std::string& gender) { gender_ = gender; }
    void set_phone_number(const std::string& phone_number) { phone_number_ = phone_number; }
    void set_email(const std::string& email) { email_ = email; }
    void set_batch_info(const std::shared_ptr<BatchInfo>& batch) { batch_info_ = batch; }
};
