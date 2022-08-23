package com.demo.j8.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapStaffDemo {
    
    public static void main(String[] args) {
        List<Staff> staff = List.of(
                new Staff("tom,", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000)),
                new Staff("peater", 30, new BigDecimal(40000)),
                new Staff("jack", 33, new BigDecimal(50000))
        );

        List<StaffPublic> result = convertToStaffPublic_BeforeJava8(staff);
        System.out.println(result);

        List<StaffPublic> result1 = convertToStaffPublic(staff);
        System.out.println(result1);


        List<String> dist_names = staff.stream()
                .map(s -> s.getName()) // create a new stream with names
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(dist_names);
    }


    private static List<StaffPublic> convertToStaffPublic(List<Staff> staff) {

        List<StaffPublic> result = new ArrayList<>();
        	// convert inside the map() method directly.
            result = staff.stream()
                            .map(temp -> {
                                StaffPublic obj = new StaffPublic();
                                obj.setName(temp.getName());
                                obj.setAge(temp.getAge());
                                
                                return obj;
                            })
                            .collect(Collectors.toList());
        
        return result;
    }

    private static List<StaffPublic> convertToStaffPublic_BeforeJava8(List<Staff> staff) {
        List<StaffPublic> result = new ArrayList<>();

        for (Staff temp : staff) {

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());

            result.add(obj);
        }

        return result;
    }

}
