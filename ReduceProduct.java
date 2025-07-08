package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class ReduceProduct {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4,5));

        Integer integer = al.stream().reduce(1, (a, b) -> a * b);
        System.out.println(integer);
    }
}
