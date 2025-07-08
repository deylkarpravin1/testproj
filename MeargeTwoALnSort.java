package com.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MeargeTwoALnSort {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4));
        List<Integer> al2 = new ArrayList<>(List.of(5,4,7,8));

        System.out.println(al);
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);

        List<Integer> sortedList = al.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }




}
