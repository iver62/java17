package com.jdojo.annotation;

import java.io.IOException;

public class PolicyTestCases {

    // Must throw IOException
    @TestCase(willThrow = IOException.class)
    public static void testCase1() {
//        ...
    }

    // We are not expecting any exception
    @TestCase
    public static void testCase2() {
//        ...
    }
}
