package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class PrintLengthString {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(List.of("pro","Sneha"));
        al.stream().forEach(word-> System.out.println(word.length()));
    }
}
