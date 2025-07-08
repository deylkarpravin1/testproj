package t;

import java.util.*;
import java.util.stream.Collectors;

public class FindSmallestPositiveNum {
    public static void main(String[] args) {
        //int[] arr= {-1,-3,2,5,3,7,1,1,4};
        int[] arr= {-1,-3};
        int result = getSmallestPositiveNumber(arr);
        if(result==-1)
            System.out.println("no missing number");
        else
            System.out.println("Missing No IS "+result);
    }
    public static int getSmallestPositiveNumber(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        for (Integer i : arr)
        {
            linkedHashSet.add(i);
        }
        System.out.println(linkedHashSet);
        int count = 1;
        int smallestMissingInt = 1;
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
        {
            int n = (int)iterator.next();
            if(n>0)
            {
                if(n==count)
                {
                    count++;
                }
                else {smallestMissingInt = count;
                    break;
                }
            }
        }
        /*for(int i = 0 ; i<arr.length;i++)
        {
            int n = arr[i];
            if(n>0)
            {
                if(n==count)
                {
                    count++;
                }
                else {smallestMissingInt = count;
                break;
                }
            }
        }*/
        return smallestMissingInt;
    }
}
