package com.jdojo.annotation;

public @interface GoodOne {

    Class element1(); // Any Class type

    Class<Employee> element2(); // Only Employee class type

    Class<? extends Employee> element3(); // Employee or its subclass type
}
