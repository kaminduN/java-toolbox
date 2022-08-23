package com.demo.j9;

import com.demo.core.AutoCloseableResources;

public class ResourcesDemoUpdate {
    

    public static void main(String[] args) {
        
        //for this to work resources needs to be either final or effectively final
        final AutoCloseableResources res1 = new AutoCloseableResources("reader");

        // a variable is effectively final if it doesn't change after the first assignment, 
        // even though it's not explicitly marked as final.
        AutoCloseableResources res2 = new AutoCloseableResources("writer");

        try (res1; res2) {
            
            res1.doSomething();
            res2.doSomething();

        } catch (Exception e) {
            //TODO: handle exception
        }


    }
}
