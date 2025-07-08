package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintOnlyDuplicate {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,1,2,3,4,4,4,4,5,6,7,8,8,8);

        Map<Integer, Long> collect = al.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        collect.entrySet().stream().filter(m->m.getValue()>1)
                .forEach(m-> System.out.println(m.getKey()+":"+m.getValue()));
    }
}
