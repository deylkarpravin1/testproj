package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(List.of("Pro","xyz","Savi","Ovi","P"));

        Map<Integer, List<String>> collect = al.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
