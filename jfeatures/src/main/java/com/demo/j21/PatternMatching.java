package com.demo.j21;

public class PatternMatching {

    public static void main(String[] args) {
        patternmatchingExample();

        printQuadrant( new Point(10, 20));
        printQuadrant(null);
    }

    static void patternmatchingExample(){
        Object obj = 42;
        System.out.println("hello pattern matching");
    }

    static void printQuadrant(Point p) {
        switch (p) {
            case Point(var x, var y) when x > 0 && y > 0 -> 
                System.out.println("first");
            case null -> //null lable
                System.out.println("null"); //writing case null -> lets you avoid the NPE
            default -> 
                System.out.println("other");
        }
    }

    // in Java 21 you can still use instanceof for this example, yet in a much shorter version
    static void printQuadrant_1(Point p) {
        if (p instanceof Point(var x, var y) && x > 0 && y > 0) {
            System.out.println("first");
        } else {
            System.out.println("other");
        }
        
    }

    static void printQuadrant_OlderWay(Point p) {
        if (p instanceof Point) {
            Point point = (Point) p;

            if (p.x() > 0 && p.y() > 0) {
                System.out.println("first");
            } else {
                System.out.println("other");
            }
        }
    }
}
