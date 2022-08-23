package com.demo.j16;

public class RecordFeature {
    
    // instance record class declaration
    private record Merchant(String name) { }


    public static void main(String[] args) {
        

        // Local record class
        record MerchantSales(Merchant merchant, double sales) {}



        Person person = new Person("John Doe", "100 Linda Ln.");
        System.out.println(person.name());

        System.out.println(person);
        System.out.println(person.hashCode());


        System.out.println(person.nameInUpperCase());

        System.out.println(Person.speakRandom());

        System.out.println(Person.VALUE);

        // *BAD practice*, overriden a public variable
        // but this is technically possible even in record sicne this is static
        Person.VALUE = "new person";
        System.out.println(Person.VALUE);

        // System.out.println(person.isRecord());

        Merchant merch = new Merchant("shop1");
        System.out.println(merch);

        MerchantSales sale1 = new MerchantSales(merch, 10.0);
        System.out.println(sale1);
    }

}
