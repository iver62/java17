package com.jdojo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.MODULE})
@Retention(RetentionPolicy.SOURCE)
public @interface ModuleOwner {

    String name();
}
