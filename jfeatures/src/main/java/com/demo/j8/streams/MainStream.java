package com.demo.j8.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    

    public static void main(String[] args) {
        
        MainStream inst = new MainStream();

        List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
        // inst.streamDemo();
		

        System.out.println(inst.sunIterator_Pre_j8(myList));

        System.out.println(inst.sunIterator_streamway(myList));


    }

    void streamDemo(List<Integer> myList){
        //parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		


		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

    }


    int sunIterator_Pre_j8(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    //Note: this can be done in one liner
    public int sunIterator_streamway(List<Integer> list){

        Stream<Integer> st = list.stream();
        int sum = st.filter(i -> i > 10) 
                     .mapToInt(i -> i) 
                     .sum();

        return sum;
    }
}
