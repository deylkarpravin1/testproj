package com.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrintMax {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6));

        int i = al.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);
    }
}
