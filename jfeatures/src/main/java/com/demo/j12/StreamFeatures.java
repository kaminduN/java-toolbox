package com.demo.j12;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.maxBy;


/*
 * How this can be implemented using newer api features
 */
public class StreamFeatures {
    

     /**
     * 
     * @param numbers list
     * @return string with <min>-<max> format
     * 
     * new API functionality: Collectors.teeing
     */
    public static String getRange(List<Integer> numbers) {

        return numbers.stream().collect(Collectors.teeing(
            minBy(Integer::compare), 
            maxBy(Integer::compare), 
            (min,max)-> String.format("%s - %s", min,max)));

    }
}
