package com.pro.java.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {
       /* String s1 = "pravin";
        String s2 = "deulkar";

        // Step 1: Concatenate both strings and assign to s1
        s1 = s1 + s2; // s1 = "pravindeulkar"

        // Step 2: Extract original s1 from s1 and assign to s2
        s2 = s1.substring(0, s1.length() - s2.length()); // s2 = "pravin"

        // Step 3: Extract original s2 from s1 and assign to s1
        s1 = s1.substring(s2.length()); // s1 = "deulkar"

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);*/

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,5,6);

        Integer reduce = list.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
        Integer reduce1 = list.stream().filter(number -> number % 2 == 0).collect(Collectors.summingInt(Integer::intValue));
        Integer reduce2 = list.stream().filter(number -> number % 2 == 0).reduce(0,(a,b)->a+b);

        System.out.println("sum is: "+reduce);


    }
}
