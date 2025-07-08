package com.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNames {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(List.of("Sneha","Pravin","ABC","zzz"));

        al.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
