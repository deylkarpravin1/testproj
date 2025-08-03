package com.pro.java.demo;

import java.util.Arrays;

public class FactorialNumber {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5}; //find out the factorial of numbers using java8 streams

        int reduce = Arrays.stream(ar).reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
    }
}
