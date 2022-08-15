package com.demo.j8;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Java 8 way of doing things
 */
public class StringFeatures {
    
    public static boolean isBlank(String value) {
        return value.trim().length() ==0;
    }

    public static String strip(String val) {
        // this has issues with unicode spaces 
        return val.trim();
    }

    public static String stripLeading(String val) {
        return val.replaceFirst("^\\s*", "");
    }

    public static String stripTrailing(String val) {
        return val.replaceFirst("^\\s++$", "");
    }

    public static String repeat(String val, int times) {
        var result ="";

        for (int i = 0; i < times; i++) {
            result += val;
        }
        return result;

    }

    public static Stream<String> lines(String val) {
        return Arrays.stream(val.split("\n"));
    }

}
