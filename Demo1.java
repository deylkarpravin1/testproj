package com.pro.java.demo;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,8,2};

        for (int j = 0 ; j<arr.length;j++)
        {
            for (int i = 0; i<arr.length-1;i++)
            {
                int currentNum = arr[i];
                int nextNumber = arr[i+1];

                if(nextNumber<currentNum)
                {
                    arr[i] = nextNumber;
                    arr[i+1] = currentNum;
                }

            }
        }

       for(Integer n : arr)
       {
           System.out.println(n);
       }
    }
}
