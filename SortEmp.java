package com.pro.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmp {
    public static void main(String[] args) {
        /*
Function/Psuedo logic to sort a list of employee objects where one
specific employee always comes first and rest of the list is sorted in
properly?

Sample Input: Abhishek, Rahul, Steve, Sumit, Mohit, Amit, Aman, Basant

Specific Employee = Steve
*/

        List<String> list = List.of( "Abhishek","Rahul","Steve","Sumit","Mohit","Amit","Aman","Basant");

        String manager = "Steve";

        List<String> collect = list.stream().sorted().collect(Collectors.toList());

        List<String> finalList = new ArrayList<>();
        finalList.add(manager);

        for(String s:collect)
        {
            if(!s.equals(manager))
            {
                finalList.add(s);
            }
        }
        System.out.println(finalList);

    }
}


