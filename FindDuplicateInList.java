package com.test.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInList {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,1,2,3,4,4,4,4,5,6,7,8,8);

        Set<Integer> s = new HashSet<>();

        al.stream().filter(i -> !s.add(i)).distinct().forEach(System.out::println);
    }
}
