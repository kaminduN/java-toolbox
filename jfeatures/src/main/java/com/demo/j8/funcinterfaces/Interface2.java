package com.demo.j8.funcinterfaces;


public interface Interface2 {
    
    void method2();

    // multiple abstact methods, this makes the interface to not be functional interface
    void coolMethod();

    default void print(String value){
        if (!isNull(value))
            System.out.println("Printing from inteface 2 "+ value);
    }

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}

}
