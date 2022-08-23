package com.demo.core_prej8;

public class Dog extends Animal implements Swimmable {
    
    @Override
    public void makeNoice() {
        System.out.println("Woof woof");
    }

    @Override
    public void swim() {
        System.out.println("Dog Swimming in water");
    }
}
