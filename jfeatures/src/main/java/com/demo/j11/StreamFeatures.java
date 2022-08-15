package com.demo.j11;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class StreamFeatures {
    

    /**
     * 
     * @param numbers list
     * @return string with <min>-<max> format
     */
    public static String getRange(List<Integer> numbers) {

           var min = numbers.stream().collect(Collectors.minBy(Integer::compare));

           Optional<Integer> max = numbers.stream().collect(Collectors.maxBy((o1, o2) -> Integer.compare(o1, o2)));
        
           BiFunction<Integer, Integer, String> bifunc = (v1,v2) -> String.format("%s - %s", v1, v2);

           return bifunc.apply(min.get(), max.get());

    }
}
