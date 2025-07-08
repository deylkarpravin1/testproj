package t;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDublicateChar {
    public static void main(String[] args) {
        String str = "i love my indiaa";

        List al= Arrays.stream(str.split(""))
                .filter(i -> !i.equals(" "))
                .collect(Collectors.toList());
        System.out.println(al);

        al.stream().filter(i -> Collections.frequency(al,i) > 1).forEach(System.out::println);
    }
}
