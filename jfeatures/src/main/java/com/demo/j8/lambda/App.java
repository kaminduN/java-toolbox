package com.demo.j8.lambda;



public class App {
    
    public static void main(String[] args) {

        //1. create a class to implement the functionality , classic/original way
        Book book = new Book();
        book.print();


        // 1.1 using anonymous inner classes to do the same thing
        new Printable() {
            @Override
            public void print() {
                System.out.println("Printing a anonymous printable thing");
            }
        }.print();


        //1.2. using a common function to use the fuctionality
        Book book1 = new Book();
        printThing(book1);

        //1.2.1 another classic way to do the same thing, using anonymous classes 
        printThing(new Printable() {
            @Override
            public void print() {
                System.out.println("Printing a anonymous printable thing");
            }
        });


        // 3. using lambda capability to create new functionality using the interface without creating a class
        //    in other case lambda is a shortcut to implementing a functional interface 
        //    this is doing the same thing we did in 1.2.1 but with less code.
        printThing( () -> {System.out.println("Printing magazine 3");});


        //4. lambda expression to implement the functionality. 
        //   in this way we are passing capability/function as a parameter to the function. 
        //   treating code as a parameter
        Printable paper = () -> {System.out.println("Printing paper");};
        // paper.print();
        printThing(paper);


    }


    static void printThing(Printable thing){
        thing.print();
    }

}
