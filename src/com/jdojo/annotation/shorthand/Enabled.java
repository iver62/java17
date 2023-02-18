package com.jdojo.annotation.shorthand;

public @interface Enabled {
    boolean status() default true;
}
