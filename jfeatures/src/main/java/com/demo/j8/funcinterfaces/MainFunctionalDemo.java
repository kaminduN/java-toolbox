package com.demo.j8.funcinterfaces;

public class MainFunctionalDemo {
    

    public static void main(String[] args) {
        
        Interface1 intface1 = new Interface1() {
            
            @Override
            public void method() {
                System.out.println("Traditional way to do. Anonymous class");
                
            }
        };

        intface1.method();



        // funcional interface/ lambda way to do the same

        Interface1 interface_lamb = () -> {
            System.out.println("Lambda way to do, full descriptive way");
        };

        interface_lamb.method();


        
        Interface1 int_lamb_short = () ->  System.out.println("Lambda way to do, shorthand");
        int_lamb_short.method();


    }
}
