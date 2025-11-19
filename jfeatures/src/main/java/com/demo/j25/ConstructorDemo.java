package com.demo.j25;

import java.lang.IllegalArgumentException;
/*
 * This class reprecents the older way to doing things
 */
public class ConstructorDemo {
    final int age;

    /*
     * Java constructors were required to invoke super(…) or this(…) as the very first statement, 
     * which often forced us to duplicate validation or initialization logic, or push it into static helper methods.
     */
    ConstructorDemo(int age) {
        super();
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less negative");
        }
        this.age = age;
    }
}
