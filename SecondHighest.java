package com.pro.java.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondHighest {
    public static void main(String[] args) {

        int[] a = {10,5,20,8,25,30,15};
        Optional<Integer> first = Arrays
                .stream(a)
                .boxed()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .skip(1)
                .findFirst();

        System.out.println(first);
      /*  for(int i = 0 ; i<=a.length;i++)
        {
            for(int j =0 ; j<a.length-1;j++)
            {
                int currentNum = a[j];
                int nextNum = a[j+1];

                if(nextNum < currentNum)
                {
                    a[j]=nextNum;
                    a[j+1]=currentNum;
                }
            }
        }
        for(int n : a)
        {
            System.out.println(n);
        }*/
    }
}
