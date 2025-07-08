package t;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWork {
    public static void main(String[] args) {
        String str = "i love my india";

        String updatedString = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(updatedString);
    }
}
