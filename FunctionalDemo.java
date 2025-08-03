package com.pro.java.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalDemo {
    public static void main(String[] args) {

        // Find first non-repeated character in a string?String inputString = "Java Concept Of The Day"

        String inputString = "Java Concept Of The Day";

        List<String> collect = Arrays.stream(inputString.split("")).collect(Collectors.toList());



        for(String s : collect)
        {
            if(Collections.frequency(collect,s) == 1)
            {
                System.out.println("First Non repeated char is : "+s);
                break;
            }
        }


















        /*  Squre s = (int a)->{
            return a*a;
        };

        int squreOfNum = s.calculate(2);
        System.out.println(squreOfNum);*/
    }
}
