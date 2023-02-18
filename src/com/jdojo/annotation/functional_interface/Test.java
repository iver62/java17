package com.jdojo.annotation.functional_interface;

// Will generate a compile-time error because a @FunctionalInterface
// annotation can only be used on interfaces
@FunctionalInterface
public class Test {

    public void test() {
        // ...
    }
}
