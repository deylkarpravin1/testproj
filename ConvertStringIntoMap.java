package com.test.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertStringIntoMap {
    public static void main(String[] args) {
        String str = "ravi:20;pravin:20";


        Map<String, Integer> collect = Arrays.stream(str.split(";"))
                .map(pair -> pair.split(":"))
                .collect(Collectors.toMap(arr -> arr[0], arr -> Integer.parseInt(arr[1])));
        System.out.println(collect);
    }
}
