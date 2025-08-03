package com.pro.java.demo;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenNum {
    public static void main(String[] args) {
        //input:1,2,3,4,5,6,7,8,9,10

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        Integer reduce = list.stream().filter(num -> num % 2 != 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of even number is: "+reduce);
    }
}
