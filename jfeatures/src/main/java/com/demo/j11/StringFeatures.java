package com.demo.j11;

/*
 * Java 11 way of doing things
 */
public class StringFeatures {
    
    public static boolean isBlank(String value) {
        return value.isBlank();
    }

    public static String strip(String val) {
        return val.strip();
    }

    public static String repeat(String val, int times) {
        return val.repeat(times);
    }

}
