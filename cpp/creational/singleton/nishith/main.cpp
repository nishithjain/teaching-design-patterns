#include "Singleton.h"

int main() {
    Singleton& s1 = Singleton::getInstance();
    s1.sayHello();

    Singleton& s2 = Singleton::getInstance();
    s2.sayHello();

    return 0;
}
