package com.jdojo.annotation.shorthand;

public @interface A {
    String value();

    int id() default 10;
}
