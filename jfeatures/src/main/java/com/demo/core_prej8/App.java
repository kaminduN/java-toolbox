package com.demo.core_prej8;

public class App {
    

    public static void main(String[] args) {
        
        Cat mycat = new Cat();
        mycat.makeNoice();
        

        Animal dog = new Dog();
        dog.makeNoice();
        // Since the dog is upcasted it can not swim at the moment

        Dog mydog = (Dog) dog;
        mydog.swim();
        // once its down casted it can now swim


        

    }
}
