package com.pro.java.demo;

import java.util.*;
import java.util.stream.Collectors;

public class StrDemo {
    public static void main(String[] args) {
        String str = "Rahul is person and Rahul is cricketer";
        List<String> list = Arrays.stream(str.split(" ")).toList();

        Set<String> set = new HashSet<>();

        /*List<String> collect = */Arrays.stream(str.split(" "))
                .filter(word -> !set.add(word))
                .forEach(e -> System.out.println(e+" "+Collections.frequency(list,e)));

       // collect.stream().forEach(e -> System.out.println(e+" "+Collections.frequency(list,e)));

    }
}
