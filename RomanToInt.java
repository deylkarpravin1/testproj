package com.pro.java.demo;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
       /* Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        String str = "MCMXCIV";
        int total = 0;
        int prevNumber = 0;
        for(int i = str.length()-1 ; i>=0;i--)
        {
            int currentNumber = map.get(str.charAt(i));

            if(currentNumber<prevNumber)
            {
                total = total - currentNumber;
            }
            else
            {
                total = total + currentNumber;
            }
            prevNumber = currentNumber;

        }

       System.out.println("convertion of roman number: "+str+" is : "+total);

    }
}
