package com.demo.j16;

import java.util.Random;

/**
 * First previewed in Java SE 14, Record feature is permanent from J16 release
 * JEP 395: Records
 * A record is a class that acts as transparent carrier for immutable data.
 */
public record Person (String name, String address) implements Walkable{

    // getters are generated 
    // no seters generated, as the records a immutable
    // argumnets become final, once the record is instantiated
    // equals and toString hashcode are generated 
    // records cannot be extended as these are final 
    //   records cannot extend any class ( due to records implicitly extending the records class)
    //   but we can implement interfaces if we want to

    public static String VALUE = "person";

    // this is a compact constructor. this allows us to overrides the constructor of the record
    // give nthat the constructor is using the same arguments
    public Person {
        // java.util.Objects.requireNonNull(name);
        if (name == null) {
            throw new java.lang.IllegalArgumentException("Name cannot be empty");
        }

        // no need to "re-declare" name
        // no need to "re-declare" Address
        
    }


    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public static String speakRandom(){
        return String.valueOf(new Random().nextInt());
    }

    @Override
    public void walk() {
        System.out.println("im walking...");
        
    }

}