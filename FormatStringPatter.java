package com.pro.java.demo;

public class FormatStringPatter {
    public static void main(String[] args) {
       /*  " +
           ""a:4,B:3,C:4,d:6,a:3"*/

        String str = "aAaaBbbCcccdddddDaaa";

        String temp = "";

        for(int i = str.length()-1;i>=0;i--)
        {
            temp = temp+ str.charAt(i);
        }

        if(str.equals(temp))
            System.out.println("String is palindrom");
        else
            System.out.println("String is not palindrom");

        //select id,name,count(*) from employee group by id,name having count>1

       /* String prevChar = str.charAt(0)+"";
        int count = 0;

        for(int i = 0 ; i<str.length();i++)
        {
            String ch = str.charAt(i)+"";

            if(ch.equalsIgnoreCase(prevChar))
            {
                count++;

            }
            else
            {
                System.out.println(prevChar+":"+count);
              prevChar = str.charAt(i)+"";
              count = 1;
            }
        }
        System.out.println(prevChar+":"+count);*/

    }
}
