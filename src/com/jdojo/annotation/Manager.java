package com.jdojo.annotation;

public class Manager extends Employee {

    @Override
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary(): " + salary);
    }
}
