#include "Singleton.h"
#include <iostream>

Singleton::Singleton() {
    std::cout << "Singleton created.\n";
}

Singleton::~Singleton() = default;

Singleton& Singleton::getInstance() {
    static Singleton instance; // Thread-safe in C++11 and above
    return instance;
}

void Singleton::sayHello() const {
    std::cout << "Hello from Singleton!" << std::endl;
}
