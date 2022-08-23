package com.demo.core_prej8.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.demo.core.AutoCloseableResources;

public class ResourcesDemo {

    public static void main(String[] args) {

        
    }

    // works after java 7
    public void try_with_resources(){
        try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
            writer.println("Hello World");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    // works after java 7, multi resources
    public void try_with_multi_resources() {
        

        try (AutoCloseableResources res1 = new AutoCloseableResources("reader");
             AutoCloseableResources res2 = new AutoCloseableResources("writer")) {
            
                res1.doSomething();
                res2.doSomething();

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
