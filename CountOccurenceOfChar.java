package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfChar {
    public static void main(String[] args) {
        String str = "ppravvinnnn";

        List<String> collect = Arrays.stream(str.split(""))
                .collect(Collectors.toList());

        collect.stream()
                .distinct()
                .forEach(ch -> System.out.println(ch +";"+Collections.frequency(collect,ch)));


        Map<String, Long> collect1 = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

    }
}
