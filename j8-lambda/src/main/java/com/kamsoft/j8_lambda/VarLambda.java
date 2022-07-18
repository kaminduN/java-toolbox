package com.kamsoft.j8_lambda;

@FunctionalInterface
interface Foo {
    String method(String string);
    default void defaultMethod() {}
}

public class VarLambda {

    private String value = "Enclosing scope value";
    // public static void main(String[] args) {
    //     String value = "value in main class";

    //     VarLambda test = new VarLambda();
    //     System.out.println(test.scopeExperiment());
        
       

    // }

    public String scopeExperiment() {

        // this created a entirely new scope
        Foo fooIC = new Foo() {
            String value = "Inner class value";
    
            @Override
            public String method(String string) {
                return this.value;
            }
        };
        String resultIC = fooIC.method("");

        // in lambda we can access the instance variable
        Foo fooLambda = parem ->  {

            String value = "inside the lambda";
            // in this case this exposes this scopes variables.
            return this.value;

        };

        String resultLambda = fooLambda.method("");

        return "Results:  resultLambda = " + resultLambda + " - resultIC: " + resultIC;
    }
}
