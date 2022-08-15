package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.demo.j12.NumberFormatFeatures;

public class App12Test {
    
     /**
     * Rigorous Test :-)
     */
    @Test
    public void getNumberformatTest()
    {
        assertEquals("1M", NumberFormatFeatures.getCompactNumberformat(1000000) );
    }

}
