package com.demo.j8;

import java.util.List;
import java.util.Optional;

public class OptionalsDemo {
    
    List<Person> personlist = List.of(
        new Person("jake", "add1"),
        new Person("tom", "add2")
        );

    public static void main(String[] args) {

        OptionalsDemo demo = new OptionalsDemo();
        Person p1= demo.findPerson("jake");

        if (p1 != null) 
            System.out.println(p1.getAddress());    
        else
            System.err.println("person not found");

        Optional<Person> op1= demo.findPersonByName("tom");
        if (op1.isPresent()) 
            System.out.println(p1.getAddress());    
        else
            System.err.println("person not found");    
        

        Optional<Person> op2= demo.findPersonByName("non exist person");
        System.out.println( op2.map(Person::getAddress).orElse("NA") );


    }

    public Person findPerson(String name){
       Person person = personlist.stream()
                        .filter(p -> p.getName().equals(name))
                        .findAny()
                        .orElse(null) ;

        return person;

    }


    public Optional<Person> findPersonByName(String name){
        Person person = personlist.stream()
                         .filter(p -> p.getName().equals(name))
                         .findAny()
                         .orElse(null) ;
 
        return Optional.ofNullable(person);
 
     }
}
