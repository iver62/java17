package com.jdojo.annotation.meta_annotations.retention;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// The Version annotation should be available at runtime
// By default the retention policy is class file only
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {

    int major();

    int minor();
}
