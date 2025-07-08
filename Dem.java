package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Dem {
    public static void main(String[] args) {
        String str = "i love java programming";
        Arrays.stream(str.split(" "))
                .map(word -> {
                   return Arrays.stream(word.split("")).distinct()
                            .map(ch->{
                                System.out.println( Collections.frequency(Arrays.asList(word),ch));
                                return ch;
                            }).collect(Collectors.joining());
                }).collect(Collectors.joining());
    }
}
