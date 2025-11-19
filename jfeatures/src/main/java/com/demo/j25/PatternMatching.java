package com.demo.j25;

public class PatternMatching {
    /*
     * Java’s pattern matching now supports primitive types, streamlining code and reducing errors. 
     * This enables direct, type-safe matching and destructuring of primitives without unnecessary boxing or verbose code.
     * Pattern cases for primitives simplify switch and instanceof. 
     * This feature promotes pattern matching for primitives more expressively
     * 
     * This approach improves type safety and readability when working with generically-typed or boxed values
     *  first introduced as a preview feature in Java SE 14
     */

    void main(){
        Object obj = 42;
        checkValue(obj);
    }
    
    /*
     * Primitive pattern matching allows instanceof to be used not just for reference types, 
     * but also primitive types like int, double, etc
     * It removes the need for manual unboxing and type-casting boilerplate
     * preview feature in Java SE 24 released from java 25+
     */
    void checkValue(Object obj){
        
        switch (obj) {
            case int i -> System.out.println("Primitive int: " + i);
            case double d -> System.out.println("Primitive double: " + d);
            default -> System.out.println("Something else");
        }
    }

    /*
    * Java 17 introduced pattern matching for the switch expressions and statements
    */
    void checkValueOldWay17(Object obj){
        
        switch (obj) {
            case Integer i -> System.out.println("Primitive int: " + i);
            case Double d ->  System.out.println("Primitive double: " + d);
            default -> System.out.println("Something else");
        }
    }


    /*
     * Pattern matching allows instanceof to be used for reference types
     * became a permanent feature since Java SE 16.
     */
    void checkValueOldWay2(Object obj){
        
        if (obj instanceof Integer val) {
            System.out.println("Primitive int value: " + val);
        } else if (obj instanceof Double val) {
            System.out.println("Primitive double value: " + val);
        }
    }

    void checkValueOlderWay(Object obj){
        
        if (obj instanceof Integer) {   
            Integer val = (Integer) obj;
            System.out.println("Primitive int value: " + val);
        } else if (obj instanceof Double) {
            Double val = (Double) obj;
            System.out.println("Primitive double value: " + val);
        }
    }
}
