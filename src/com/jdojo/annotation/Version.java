package com.jdojo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// The target meta-annotation specifies that the Version annotation type can be used with
// program elements of only three types: any type (class, interface, enum and annotation types),
// constructors and method
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Version {

    int major();

    int minor() default 0; // Set 0 as default value for minor
}
