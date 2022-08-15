package com.demo.j8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Java 8 way of doing things
 */
public class FileFeatures {
    

    public static void writeString(String filecontent) throws IOException{
        String fileName = "example.txt";
        var writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(filecontent);
        writer.close();
    }


}
