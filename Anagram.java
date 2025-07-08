package t;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {

        // two strings are considered anagrams if they have the same characters with the same frequency,
        // but the order of the characters is different.
        String s1= "listen";
        String s2= "silent";
        System.out.println(s1);
        System.out.println(s2);
       /* List<Character> al1 = new ArrayList<>();
        List<Character> al2 = new ArrayList<>();*/


          /*  for (int i = 0 ; i<s1.length();i++)
            {
                al1.add(s1.charAt(i));
                al2.add(s2.charAt(i));
            }
            System.out.println(al1);
            System.out.println(al2);*/

            //System.out.println(al1.equals(al2));

           // al1=al1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            s1=Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
            System.out.println("updated by arrays "+s1);
            s2=Arrays.stream(s2.split("")).sorted().collect(Collectors.joining());
            //al2=al2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

            System.out.println(s1);
            System.out.println(s2);
            if (s1.equals(s2))
                System.out.println("String is anagram");
            else System.out.println("string not anagram");

    }
}
