package com.pro.java.demo;

public class StackTest {
    int arr[] = new int[5];
    int top = -1;
    int index = 0;
    public static void main(String[] args) {

    }

    public void push(int number)
    {
          if(top == arr.length)
         {
        System.out.println("Stack is full");
        }
        else if(top< arr.length)
        {
            arr[index] = number;
            top++;
            index++;
        }

    }

    public int pop()
    {
        int value = 0;
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            value =  arr[top];
            top--;
            index--;
        }
        return value;
    }
}
