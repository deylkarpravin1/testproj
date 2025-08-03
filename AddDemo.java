package com.pro.java.demo;

public class AddDemo {
    public static void main(String[] args) {
        Add a = (int x,int y)->{
            System.out.println(x+y);
        };

        a.sum(4,4);
    }
}
