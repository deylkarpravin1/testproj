package t;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RowClmInterchange {
    public static void main(String[] args) {
        int [][]x = {{1,2,3},{4,5},{7,8,9}};
        for (int i=0; i<x.length;i++)
        {
            for (int j = 0; j < x[i].length;j++)
            {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }


        List<Integer> list = new ArrayList<>(List.of(1,1,2,2,2,4,5,66,6,66,6,66,7));
        System.out.println("before removing duplicates"+list);
        //list =list.stream().distinct().collect(Collectors.toList());
        //System.out.println("after removing duplicates"+list);
        list.stream().filter(integer -> integer %5==0).forEach(System.out::println);
        System.out.println(list);
        int n=list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(n);
        int minN=list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minN);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        list.stream().filter(integer -> integer%2==0).forEach(System.out::print);
        System.out.println("below" );
        list.stream().map(s ->s+"").filter(s -> s.startsWith("1")).forEach(System.out::print);
        System.out.println();
        list.stream().map(i -> i*i*i).filter(i -> i>50).forEach(System.out::println);
      //  int secondMax=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        //System.out.println(secondMax);

    }
}
