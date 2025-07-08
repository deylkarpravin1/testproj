package t;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int mid = 0;
        int low = 0;
        int high = arr.length-1;

        int num = 4;
        int index = -1;

        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr[mid] == num)
            {
                index = mid;
                break;
            }
            if(num<arr[mid])
            {
                high = mid-1;
            }
            if (num>arr[mid])
            {
                low = mid+1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Number "+num+" found at index: "+index);
    }
}
