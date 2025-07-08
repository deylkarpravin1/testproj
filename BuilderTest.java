package com.test.java8.test;

public class BuilderTest {
    public static void main(String[] args) {
        Person pravin = new Person.PersonBuilder().setName("pravin").build();
        Person pune1 = new Person.PersonBuilder().setAddr("Pune").setMobile(1234).build();
        System.out.println(pravin);
        System.out.println(pune1);
    }
}
