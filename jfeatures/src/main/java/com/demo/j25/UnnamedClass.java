//An unnamed class is always a member of the unnamed package. So we cannot declare a package statement in it.

/*
 * unnamed classes feature is a great addition to the language which will benefit the programmer 
 * who inspires to learn Java and come from other languages with similar quick-to-start syntaxes, such as Python
 * introduces in java 21 (preview) and released in java 25
 * 
 * Note:
 * While unnamed classes offer a streamlined way to implement quick solutions, 
 * their use should be limited to situations where a full class declaration is unnecessary or overly cumbersome. 
 * They are best used in scenarios requiring minimal implementation efforts, 
 * such as creating listeners for GUI events or small runnable objects.
 * 
 * An unnamed class is always final and it cannot extend another class
 * 
 * Note: You can run this using 
 *      java UnnamedClass.java
 */

    void main(String[] args) {
        System.out.println("Main method with args");
    }
    
    void main() {
        System.out.println("Hello from Java 25!");

        if(this.instanceVariable) {
            System.out.println("instance Variable");
        }

        if(staticVariable) {
            System.out.println("static variable");
        }

        staticMethod();
    }

    static boolean staticVariable = true;
    boolean instanceVariable = true;

    static void staticMethod(){
        System.out.println("static method");
    }
