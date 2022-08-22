package com.demo.j8.funcinterfaces;


/**
 * Notes on Interfaces:
     Like abstract classes, interfaces cannot be used to create objects (it is not possible to create an "Interface1" object in the MyMainClass)
     Interface methods do not have a body - the body is provided by the "implement" class
     On implementation of an interface, you must override all of its methods
     Interface methods are by default abstract and public
     Interface attributes are by default public, static and final
     An interface cannot contain a constructor (as it cannot be used to create objects)

 */
public class MainFunc extends SuperClass implements Interface1, Interface2{

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void method() {
        // TODO Auto-generated method stub
        
    }

    // since there are duplicates in the interface this must be resolved here
    @Override
    public void print(String val) {
        
        Interface1.super.print(val);
        Interface2.super.print(val);
    }

    @Override
    public void coolMethod() {
        // TODO Auto-generated method stub
        
    }

    public void testingStaticFunc(){
        System.out.println("method: testingStaticFunc");
        Interface2.super.print("new testing value");
        Interface2.super.print("");
    }

    /* 
       this method signature is also avilabe in the interface 2 , but as a static mtd
       this implementation doesnt have any efect in the interface implementation
    */
    public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

    public static void main(String[] args) {
        
        String val = "helloo";

        System.out.println("priting from main"+ val);

        MainFunc inst = new MainFunc();
        inst.print(val);

        /* 
        although the interface also have this method the priority goes to the super class 
        */
        inst.someCoolMethodImpl();
        


        inst.testingStaticFunc();

    }

   
    
}
