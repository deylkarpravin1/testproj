package t;

import java.util.HashMap;
import java.util.Scanner;

public class OccurOfCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string");
        String str = s.nextLine();
        System.out.println("you enter "+str);

        HashMap<Character,Integer> charMap = new HashMap<>();

        for (int i = 0 ; i < str.length()-1;i++)
        {
            Character ch = (Character) str.charAt(i);
            if(charMap.containsKey(ch))
            {
               // Integer count = charMap.get(ch);
                charMap.put(ch, Integer.valueOf(charMap.get(ch)+1));
            }
            else
            {
                charMap.put(ch, Integer.valueOf(1));
            }
        }

        System.out.println(charMap);
    }
}
