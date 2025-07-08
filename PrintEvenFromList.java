package com.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenFromList {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        //al.stream().filter(i -> i%2==0).forEach(System.out::println);
        al =al.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(al);
    }
}
