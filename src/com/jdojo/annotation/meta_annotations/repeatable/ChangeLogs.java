package com.jdojo.annotation.meta_annotations.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ChangeLogs {

    ChangeLog[] value();
}
