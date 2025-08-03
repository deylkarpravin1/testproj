package com.pro.java.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        String str[]={"apple", "banana", "apple", "orange", "banana", "apple","mango", "banana", "orange", "banana"};
        //Count the frequency of word in java 8 using Streams

        Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
