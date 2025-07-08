package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class SqureIntAndPrint {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        al.stream().map(i -> i*i ).forEach(System.out::println);
    }
}
