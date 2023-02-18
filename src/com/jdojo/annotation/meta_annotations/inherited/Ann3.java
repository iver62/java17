package com.jdojo.annotation.meta_annotations.inherited;

import java.lang.annotation.Inherited;

// Inherited has no effect if an annotation type is used to annotate
// any program elements other than a class declaration
@Inherited
public @interface Ann3 {
    int id();
}
