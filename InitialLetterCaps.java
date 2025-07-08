package t;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InitialLetterCaps {
    public static void main(String[] args) {
        String str = "i love my india";

        String updatedString = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0,1).toUpperCase()+word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(updatedString);

    }
}
