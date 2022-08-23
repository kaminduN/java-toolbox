package com.demo.j8.functional_interfaces;

/**
 * Notes:
 * An interface with exactly one abstract method becomes a Functional Interface
 * 
 * @FunctionalInterface annotation is a facility 
 * to avoid the accidental addition of abstract methods in the functional interfaces
 */
@FunctionalInterface
interface Interface1 {
    
    void method();

    default void print(String val){
        System.out.println("Printing from interface 1"+ val);
    }

    default void someCoolMethodImpl(){
        System.out.println("Doing something cool in the interface");
    }


}
