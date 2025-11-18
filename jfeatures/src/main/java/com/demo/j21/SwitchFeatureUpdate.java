package com.demo.j21;

public class SwitchFeatureUpdate {
    
    //Java 21 introduces pattern matching 
    //Multiple case labels like "MONDAY", "TUESDAY" are handled via commas.
    //Block Statements with Yield
    public int switchExpressionExample(String day){

        int dayNumber = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->  1;
            case "SATURDAY", "SUNDAY" -> { 
                System.out.println("It's the weekend!");
                yield 2; // Returns this value for the switch expression
            }
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("Day Group: " + dayNumber);

        return dayNumber;
    }
}
