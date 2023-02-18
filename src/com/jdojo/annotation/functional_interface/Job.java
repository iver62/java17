package com.jdojo.annotation.functional_interface;

// Will generate a compile-time error because the Job interface declare
// two abstract methods, and therefore it is not a functional interface
@FunctionalInterface
public interface Job {

    void run();
    void abort();
}
