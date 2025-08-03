package com.pro.java.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoClass {
    public static void main(String[] args) {
        /*String str1 = "I Love My Country";

        Map<Integer, List<String>> collect = Arrays.stream(str1.split(" "))
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);*/

        String str = "pravinpr";

        for(int i = 0 ; i<str.length();i++)
        {
            char currentChar = str.charAt(i);
            int count = 1;
            boolean flag = false;
            for(int j = 0 ; j<str.length();j++)
            {
                if(i!=j)
                {
                    if(currentChar == str.charAt(j))
                    {
                        count++;
                    }
                }
            }
            if(count == 1)
            {
                flag = true;
            }
            if (flag)
            {
                System.out.println("First Non reating char: "+ currentChar);
                break;
            }
        }

        // 5th highest salary
     //  select distinct salary form employee order by salary desc limit 4,1


        //grouping by sarary
              //  select salary , count(*) from employee gruoup by salary
    }
}
































