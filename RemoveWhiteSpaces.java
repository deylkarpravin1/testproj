package com.test.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "pravin Deulkar";

        String replace = str.replace(" ", "");
        System.out.println(replace);

        String collect = Arrays.stream(str.split(" "))
                .collect(Collectors.joining());

        System.out.println(collect);

    }
}
