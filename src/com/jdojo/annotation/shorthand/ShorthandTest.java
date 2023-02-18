package com.jdojo.annotation.shorthand;

public class ShorthandTest {

    // No need to specify the values for the status element because it has a default value
    @Enabled // OK
    static class EnabledTest {
        // ...
    }

    @Enabled() // OK
    static class EnabledTestBis {
        // ...
    }

    @Company(value = "Abc Inc.")
    static class CompanyTest {
        // ...
    }

    @Company("Abc Inc.") // value can be omitted when the name of the annotation type is value
    static class CompanyTestBis {
        // ...
    }

    // No need to specify name of the element
    @Reviewers({"John Jacobs", "Wally Inman"})
    static class ReviewersTest {
        // ...
    }

    @Reviewers("John Jacobs")
    static class ReviewersTestBis {
        // ...
    }

    // Same as @A(value = "Hello", id = 10)
    @A("Hello")
    static class Test {
        // ...
    }

    // Won't compile. Mist use only one value to omit the element name
    // @A("Hello", id = 16)
    static class WontCompile {
        // ...
    }

    // OK. Must use name = value pair when passing more than one value
    @A(value = "Hello", id = 16)
    static class TestBis {
        // ...
    }
}
