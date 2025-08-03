package com.pro.java.demo;

import java.util.Arrays;
import java.util.OptionalInt;

public class StockPrice {
    public static void main(String[] args) {
        /*Maximize Profit.
        Cost Price of 1 Stock from Day-1 to Day-7 is as follows,
                Input: 6, 4, 2, 4, 3, 20, 1
        Output: Day-3 & Day-6*/

        int arr[] = {6, 4, 2, 4, 3, 20, 1};

        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays.stream(arr).min();

        StockPrice s = new StockPrice();
        String buyDay = s.buy(arr,min.getAsInt());
        String sellDay = s.sell(arr,max.getAsInt());
        System.out.println(min.getAsInt());
        System.out.println(max.getAsInt());

        System.out.println(buyDay+" & "+sellDay);



    }
    public String buy(int arr[],int min)
    {
        String str = "";
        for(int i =0 ; i<arr.length;i++)
        {
            if(min == arr[i])
            {
                str = "Day-"+i;
                break;
            }
        }
        return str;
    }
    public String sell(int arr[],int max)
    {
        String str = "";
        for(int i =0 ; i<arr.length;i++)
        {
            if(max == arr[i])
            {
                str = "Day-"+i;
                break;
            }
        }
        return str;
    }
}
