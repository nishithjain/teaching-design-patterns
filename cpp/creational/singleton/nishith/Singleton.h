#ifndef SINGLETON_H
#define SINGLETON_H

class Singleton {
public:
    static Singleton& getInstance();

    void sayHello() const;

    // Delete copy operations
    Singleton(const Singleton&) = delete;
    Singleton& operator=(const Singleton&) = delete;

private:
    Singleton();
    ~Singleton();
};

#endif // SINGLETON_H
