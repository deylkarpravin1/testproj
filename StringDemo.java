package com.pro.java.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        String s = "jjaavvvaa";

        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Iterator<Map.Entry<String, Long>> iterator = collect.entrySet().iterator();
        Long max = 0L;
        String str = "";
        while (iterator.hasNext())
        {
            Map.Entry<String, Long> next = iterator.next();
            if(next.getValue()>max)
            {
                max = next.getValue();
                str = next.getKey();
            }

        }
        System.out.println(str);

    }
}
