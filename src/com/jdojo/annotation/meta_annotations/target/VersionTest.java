package com.jdojo.annotation.meta_annotations.target;

import com.jdojo.annotation.Version;

// OK. A class type declaration
@Version(major = 1, minor = 0)
public class VersionTest {

    // OK. A constructor declaration
    @Version(major = 1, minor = 0)
    public VersionTest() {
        // ...
    }

    // OK. A method declaration
    @Version(major = 1, minor = 1)
    public void doSomething() {
        // ...
    }
}
