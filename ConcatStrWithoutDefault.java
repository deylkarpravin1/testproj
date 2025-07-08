package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStrWithoutDefault {
    public static void main(String[] args) {
        String s1 = "pravin";
        String s2 = "deulkar";

        char[] arr = new char[s1.length()+s2.length()];
        System.out.println("string length"+s1.length()+s2.length());
        System.out.println("array length"+arr.length);

        int i =0;
        for ( ; i <= s1.length()-1 ; i++)
        {
            System.out.println(i);
            System.out.println(s1.charAt(i));
            arr[i] = s1.charAt(i);
        }
        System.out.println(i);
        for ( ; i <s2.length() + s1.length() ; i++)
        {
            System.out.println(i);
            System.out.println(s2.charAt(i));
            arr[i] = s2.charAt(i);

        }
        System.out.println(i);

        String result = new String(arr);
        System.out.println(result);
    }
}
