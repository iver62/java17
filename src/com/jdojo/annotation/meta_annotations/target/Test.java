package com.jdojo.annotation.meta_annotations.target;

public class Test {

    public void processData() throws @Fatal Exception {
        double value = getValue();
        int roundedValue = (@NonZero int) value;
        Test t = new @Fatal Test();
        // ...
    }

    public double getValue() {
        double value = 189.98;
        // ...
        return value;
    }
}
