package t;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AcceptListNReverse {
    public static List<String> getModifiedList(List<String> list)
    {
        List<String> stringList = new LinkedList<>();
        for(int i = list.size()-1;i>=0;i--)
        {
            String string = list.get(i);
            stringList.add(string);

        }
        System.out.println(stringList);
        List<String> collect = stringList
                .stream()
                .map(word -> new StringBuffer(word).reverse().toString())
                .collect(Collectors.toList());
        return collect;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pravin");
        list.add("Sneha");
        list.add("Savi");
        List<String> modifiedList = getModifiedList(list);
        System.out.println(modifiedList);
    }
}
