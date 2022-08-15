package com.demo.j12;


/*
 * Java 12 , new intros
 */
public class StringFeatures {
    

    public static String indent(String val, int indent) {
        /*
         * Note: This adds a new line character to the string automatically
         */
        return val.indent(indent);
    }


}
