package com.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighestSal {
    public static void main(String[] args) {
        List<Employee> al = new ArrayList<>(List.of(new Employee(1,1000),
                new Employee(2,2000),new Employee(3,3000)));

        //Third highest salary
        Optional<Employee> first = al.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(2).findFirst();
        System.out.println(first);

        Optional<Integer> first1 = al.stream().sorted(Comparator.comparingInt(Employee::getSalary))
                .skip(1)
                .map(Employee::getId).findFirst();


        System.out.println(first1);
    }
}
