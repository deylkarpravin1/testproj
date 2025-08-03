package com.pro.java.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
       /* Sample Input ["aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"]

        Sample Output
        aaryanna - 4
        aayanna - 3
        Explaination:-
                aaryanna has four distinct characters: 'a', 'n', 'r', and 'y'.
                aayanna has three distinct characters: 'a', 'n', and 'y'.*/

        String str[] = {"aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"};

        List<String> wordsWithaa = Arrays.stream(str).filter(word -> word.startsWith("aa")).collect(Collectors.toList());
        //System.out.println(wordsWithaa);

        for(String s:wordsWithaa)
        {
            long count = Arrays.stream(s.split("")).distinct().count();
            System.out.println(s+" - "+count);
        }
    }
}
