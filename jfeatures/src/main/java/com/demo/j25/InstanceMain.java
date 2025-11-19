package com.demo.j25;

/*
 * Now Java supports top-level instance main methods and class-less compact files.
 * 
 * Summary
   Evolve the Java language so that students can write their first programs 
   without needing to understand language features designed for large programs. 
   Far from using a separate dialect of Java, students can write streamlined declarations for single-class programs and then seamlessly expand their programs to use more advanced features as their skills grow.
 */
class InstanceMain extends HelloWorldSuper{   

    /*
     * The refined launch protocol chooses automatically a starting point for our program, taking into account both availability and access level.
     *
     *   Instance main() methods should always have a non-private access level. 
     *   Moreover, the launch protocol follows a specific order to decide which method to use:
     * 
     *       a static void main(String[] args) method declared in the launched class
     *       a static void main() method declared in the launched class
     *       a void main(String[] args) instance method declared in the launched class or inherited from a superclass
     *       a void main() instance method
     * 
     * 
     */
    private String message = "Hello from the instance main method!";
 
    //since there is a main method in the super class that gets precident over this one 
    // and print the output form the super main class
    void main() {
        System.out.println(message);
        additionalMethod();
    }
 
    public void additionalMethod() {
        System.out.println("This is an additional method called from the main method.");
    }
 

}
