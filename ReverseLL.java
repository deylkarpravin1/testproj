package com.pro.java.demo;

import java.util.LinkedList;
import java.util.List;

public class ReverseLL {
    public static void main(String[] args) {

       /* 2. Reverse a LinkedList ABCD .

        OUTPUT - DCBA*/

        List<String> list = new LinkedList<>();
        list.add("ABCD");

        list.stream().map(word -> new StringBuffer(word).reverse()).forEach(System.out::println);
    }
}
