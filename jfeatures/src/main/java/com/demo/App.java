package com.demo;

import com.demo.j12.StringFeatures;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.print(StringFeatures.indent("   hellooooo", -5));
        System.out.println( "----------" );
    }
}
