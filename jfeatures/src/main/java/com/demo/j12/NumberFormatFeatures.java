package com.demo.j12;

import java.text.NumberFormat;

public class NumberFormatFeatures {
    

    public static String getCompactNumberformat(int i) {

        return NumberFormat.getCompactNumberInstance().format(i);
        
    }
}
