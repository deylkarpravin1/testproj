package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfPrime {
    public static void main(String[] args) {
        int n = 10;

        Integer integer = IntStream.rangeClosed(2,n).filter(number -> {
            if(number<2)
                return false;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }).reduce(0, Integer::sum);

        System.out.println(integer);

    }
}
