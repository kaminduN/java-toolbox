package com.demo.j11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * Java 11 way of doing things
 */
public class FileFeatures {

    public static void writeFile(String fileContent) throws IOException {

        Files.writeString(Paths.get("example.txt"), fileContent, StandardOpenOption.CREATE);

    }

    public static String readFile(File file) throws IOException {

        return Files.readString(file.toPath());
    }
}
