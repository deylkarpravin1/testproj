package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class ReduceListSum {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4));

        Integer integer = al.stream().reduce(0, Integer::sum);
        System.out.println(integer);
    }
}
