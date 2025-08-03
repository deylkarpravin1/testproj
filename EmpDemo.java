package com.pro.java.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,2));

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.entrySet().stream().filter(e -> e.getValue()>1).map(e->e.getKey()).forEach(System.out::println);

        //System.out.println(collect);

        // list.stream().filter(num -> Collections.frequency(list,num) > 1).forEach(System.out::println);

      //  list.stream().collect(Collectors.toMap(e -> e.getDept(), Collectors.maxBy(e -> e.getSal()) ))
    }
}
