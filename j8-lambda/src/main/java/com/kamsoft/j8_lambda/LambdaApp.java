package com.kamsoft.j8_lambda;

/**
 * Hello lambda world!
 *
 */
public class LambdaApp {
    public static void main(String[] args) {

        LambdaApp app = new LambdaApp();

        MathOperation sum = (int a, int b) -> a + b;

        System.out.print("Summation: 10 + 20 = " + app.operate(10, 20, sum));

        
        GreetingService greet = (message) -> 
                                    System.out.println("Greeting message from lambda "+ message);
        
        greet.sayMessage("Hello from lambda");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    
    
    private int operate(int a, int b, MathOperation mathOp) {
        return mathOp.operation(a, b);
    }
}
