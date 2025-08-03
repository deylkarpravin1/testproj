package com.pro.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class JavaCodeDemo {
    public static void main(String[] args) {

        //need to sum the digit from string
        //146+456+56
        String str = "pravin146deulkar456sh56";

        /*List<Object> collect = Arrays.stream(str.split(""))
                .map(ch -> {
                    if (ch.equals("1") || ch.equals("4") || ch.equals("5") || ch.equals("6")) {
                        return Integer.parseInt(ch);
                    }
                    return 0;
                }).collect(Collectors.toList());

       // System.out.println(collect);

        Object reduce = collect.stream().map(n -> Integer.parseInt(n+"")).reduce(0, Integer::sum);
        System.out.println("sum is: "+reduce);*/


        String[] split = str.split("\\D+");
        int sum =0;

        for(String s : split)
        {
            //System.out.println(s);
            if(!s.isEmpty())
                sum+= Integer.parseInt(s); 
        }
        System.out.println(sum);


        //below code is to find out second and third highest
       /* int arr[] = {1,26,15,55,31};

        OptionalInt maxNumber = Arrays.stream(arr).max();

        for(int i = 0 ; i<arr.length;i++)
        {
            for(int j = 0 ; j<arr.length-1;j++)
            {
                int currentNumber = arr[j];
                int nextNumber = arr[j+1];

                if(currentNumber<nextNumber)
                {
                    arr[j] = nextNumber;
                    arr[j+1]= currentNumber;
                }
            }
        }
        *//*for(int x : arr)
        {
            System.out.println(x);
        }*//*
        System.out.println("second highest: "+arr[1]);
        System.out.println("third highest : "+arr[2]);*/





    }
}
