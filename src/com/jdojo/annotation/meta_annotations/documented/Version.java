package com.jdojo.annotation.meta_annotations.documented;

import java.lang.annotation.*;

// Final version of the Version annotation type
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD,
        ElementType.MODULE, ElementType.PACKAGE, ElementType.LOCAL_VARIABLE,
        ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Version {

    int major();

    int minor();
}
