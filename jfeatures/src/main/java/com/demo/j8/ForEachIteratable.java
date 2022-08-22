package com.demo.j8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachIteratable {
    
    public static void main(String[] args) {
        

        List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) 
            myList.add(i);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}


        //traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);



    }
}


//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
}