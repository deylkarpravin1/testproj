package com.test.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GreaterSalineachdept {
    public static void main(String[] args)
    {


        List<Employee1> list = new ArrayList<>(List.of(
                new Employee1("pravin",4000,"IT"),
        new Employee1("sneha",3000,"IT"),
        new Employee1("ovi",100,"IT"),
        new Employee1("Savi",8000,"Computer"),
        new Employee1("dada",6000,"Computer"),
        new Employee1("Savi",2000,"Computer")
        ));

        Map<String, List<Employee1>> collect = list.stream()
                .filter(e -> e.getSalary() > 2000)
                .collect(Collectors.groupingBy(e -> e.getDept()));
        System.out.println(collect);
    }
}


class Employee1
{
    private String name;
    private int salary;
    private String dept;

    public Employee1(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
