package com.demo.core;

public class AutoCloseableResources implements AutoCloseable {

    private final String type;

    public AutoCloseableResources() {
        this.type = "";
        System.out.println("Constructor -> AutoCloseableResources");
    }

    public AutoCloseableResources(String type) {
        this.type = type;
        System.out.println("Constructor -> AutoCloseableResources " + type);
    }

    public void doSomething() {
        System.out.println("Something -> AutoCloseableResources " + type);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources " + type);
    }
}
