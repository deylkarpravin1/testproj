package t;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0,1,3,0,44,55,0,0,22,99};

        int number = arr[0]; // O(1)

       /* for (int i = 0 ; i < arr.length; i++) //O(n)
        {
            System.out.println(arr[i]);
        }*/

        for(int j = 0; j<arr.length;j++) //O(n*2)
        {
            for (int i = 0 ; i < arr.length-1; i++)// O(n)
            {
                if(arr[i] == 0 )//O(1)
                {
                    int temp = arr[i+1];//O(1)
                    arr[i+1]= arr[i];//O(1)
                    arr[i] = temp;//O(1)
                }
            }
        }//O(n*2)+O(n)+O(1) ==O(n*2)


        System.out.println(Arrays.toString(arr));
    }
}
