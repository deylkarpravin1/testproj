package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class CountNPrint {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6));

        long counted = al.stream().count();
        System.out.println(counted);
    }
}

