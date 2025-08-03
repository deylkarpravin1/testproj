package com.pro.java.demo;

public class SecondHigh {
    public static void main(String[] args) {
        int arr[] = {2,5,5,1,7,7};

        int max = 0;
        int secondMax= 0;

        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondMax = max;
                max = arr[i];

            }
        }

        System.out.println("Second Max: "+secondMax);

      /*  for(int i = 0 ; i<arr.length;i++)
        {
            for(int j = 0; j<arr.length-1;j++)
            {
                int currentNum = arr[j];
                int nextNum = arr[j+1];

                if(currentNum<nextNum)
                {
                    arr[j] = nextNum;
                    arr[j+1]=currentNum;
                }
            }
        }
        System.out.println(arr[1]);*/


       /* @PostMapping("/Users")
        public User addUser(@RequestBody User user)
        {

        }
*/


    }
}
