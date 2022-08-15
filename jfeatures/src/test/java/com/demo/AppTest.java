package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.demo.j8.HttpClientFeatures;
import com.demo.j8.StringFeatures;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @ParameterizedTest
    @ValueSource(strings = {"", "Learning  "})
    public void isBlankTest(String value)
    {
        // "\u2000" - this would fail in java 8 way of doing it

        boolean original = StringFeatures.isBlank(value);
        boolean expected =com.demo.j11.StringFeatures.isBlank(value);

        assertEquals(expected, original);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "Learning  ", "   something"})
    public void stripTest(String value)
    {
        // "\u2000  abc" - this would fail in java 8 way of doing it

        String original = StringFeatures.strip(value);
        String expected =com.demo.j11.StringFeatures.strip(value);

        assertEquals(expected, original);
    }



    @Test
    @Disabled
    public void httpClientTest()
    {
        assertEquals(200, HttpClientFeatures.sendGet() );

        // assertEquals(200, com.demo.j11.HttpClientFeatures.sendGet() );
    }
}
