package com.test.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        String s="House,House,House,House, Dog, Dog,Dog";
        Map<String, Long> collect = Arrays.stream(s.split(","))
                .map(word -> word.trim())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
