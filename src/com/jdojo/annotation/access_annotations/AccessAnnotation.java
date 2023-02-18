package com.jdojo.annotation.access_annotations;

import com.jdojo.annotation.meta_annotations.documented.Version;

@Version(major = 1, minor = 0)
public class AccessAnnotation {

    @Version(major = 1, minor = 1)
    public void testMethod() {
        // ...
    }

    @Version(major = 1, minor = 2)
    @Deprecated
    public void testMethod2() {
        // ...
    }
}
