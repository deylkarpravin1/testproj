package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOrCollectDistince {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,1,2,2,2,3,3,3,4,5,6,6,6,6,6,9));

        //al.stream().distinct().forEach(System.out::println);
        al = al.stream().distinct().collect(Collectors.toList());
        System.out.println(al);
    }
}
