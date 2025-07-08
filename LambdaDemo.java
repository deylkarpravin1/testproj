package com.test.java8;

public class LambdaDemo {
    public static void main(String[] args) {
        TestAddInterface demo = (a, b)-> {
            return a+b;
        };
        int result=demo.add(2,44);
        System.out.println(result);
    }
}
