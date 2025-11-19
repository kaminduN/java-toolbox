package com.demo.j25;

public class FLexibleConstuctor extends ConstructorDemo{
    final String name;

    FLexibleConstuctor(String name, int age) {
        if (age < 18 || age > 67)
            throw new IllegalArgumentException("Age must be between 18 and 67");
        super(age); // super() is no longer required as the first statement in Java 25
        this.name = name;
    }

    public static void main(String[] args) {
        var emp = new FLexibleConstuctor("Alice", 35);
        System.out.println("Person age set: " + emp.age);
    }
}
