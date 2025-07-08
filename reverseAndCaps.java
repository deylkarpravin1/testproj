package com.test.java8;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class reverseAndCaps {
    public static void main(String[] args) {

        StringBuffer br = new StringBuffer("pravin".toUpperCase());

        br.reverse();
        System.out.println(br);

      Arrays.asList("pravin")
                .stream()
                .map(word -> new StringBuffer(word.toUpperCase()).reverse())
                .forEach(System.out::println);

      List<String> al = new ArrayList<>(List.of("pravin","pravin","sneha","savi"));
      String str = "pravin";
        long counted = al.stream().filter(word -> word.equalsIgnoreCase(str)).count();
        System.out.println(counted);
    }
}
