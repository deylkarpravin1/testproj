package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlattingAndSplitting {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(List.of("i Love","My India so Much","Proud of it"));

        List<String> collect = al.stream()
                .flatMap(sencence -> Arrays.stream(sencence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(collect);

        List<List<String>> nestedList = Arrays.asList(Arrays.asList("apple","banana"),Arrays.asList("orange","mango"));

        List<String> collect1 = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(collect1);

    }
}
