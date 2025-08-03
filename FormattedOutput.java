package com.pro.java.demo;

import java.util.ArrayList;
import java.util.List;

public class FormattedOutput {
    public static void main(String[] args) {
      /*  1. Create a formatted numbered list from a given array of numbers 42, 7, 19, 83.
        Output:
        1. 42
        2. 7
        3. 19
        4. 83*/

        List<Integer> list = new ArrayList<>(List.of(42, 7, 19, 83));

        for (int i =0 ; i<list.size();i++)
        {
            System.out.println(i+1+". "+ list.get(i));
        }
    }
}
