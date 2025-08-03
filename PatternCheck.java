package com.pro.java.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PatternCheck {
    public static void main(String[] args) {
        /* "([])" - true

            "(]" - false

             "()[]{}" - true
        */
        String str = "([])";
        boolean b = checkPattern(str);
        System.out.println(str+" - "+b);

       /*
       String str = "frog has jumped over fence and rabit has jumped over fence too";

        String collect = Arrays.stream(str.split(" ")).map(word -> word.substring(0, 1) + "")
                .collect(Collectors.joining(""));

        System.out.println(collect);
        */


    }

    public static boolean checkPattern(String str)
    {
        boolean circularFlag = false;
        boolean squareFlag = false;
        boolean curlyFalg = false;


        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i) == '(')
            {
               String tempString  = str.substring(i+1);
                boolean contains = tempString.contains(")");
                if(contains)
                {
                    circularFlag = true;
                    break;
                }
            }
        }
        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i) == '{')
            {
                String tempString  = str.substring(i+1);
                boolean contains = tempString.contains("}");
                if(contains)
                {
                    curlyFalg = true;
                    break;
                }
            }
        }
        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i) == '[')
            {
                String tempString  = str.substring(i+1);
                boolean contains = tempString.contains("]");
                if(contains)
                {
                    curlyFalg = true;
                    break;
                }
            }
        }

        System.out.println(circularFlag+" " +squareFlag+" "+curlyFalg);

       if (circularFlag && curlyFalg && squareFlag)
           return true;
       else
           return false;
    }
}
/*
class a
{
    int add(int n)
    {
        return n;
    }

}
class b extends a
{
    String add(int n)
    {
        return n;
    }
}*/
