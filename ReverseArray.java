package t;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};

        for(int i = 0,j = arr.length-1; i<=arr.length/2 ; i++,j--)
        {
            int a = arr[i];
            int b = arr[j];
            arr[i] = b;
            arr[j] = a;
        }

        System.out.println(Arrays.toString(arr));
    }
}
