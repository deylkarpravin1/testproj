package t;

import java.util.HashMap;
import java.util.Map;

public class CountPatterOfString2 {
    public static void main(String[] args) {
        String str = "XXXZZFFYYZZTTXXZZXX";

        Map<String,Integer> patternCount = new HashMap<>();

        String stringToAdd = "";
        char currentChar ='a';

        for (int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(i == 0)
            {
                currentChar = str.charAt(i);
                stringToAdd = stringToAdd + ch;
                continue;
            }

            if(ch == currentChar)
            {
                stringToAdd = stringToAdd + ch;
            }
            else {
                if (patternCount.containsKey(stringToAdd))
                {
                    patternCount.put(stringToAdd,patternCount.get(stringToAdd)+1);
                }
                else
                {
                    patternCount.put(stringToAdd,1);
                }
                currentChar = ch;
                stringToAdd="";
                stringToAdd = stringToAdd+ch;
            }
        }
        // adding last pattern
        if (patternCount.containsKey(stringToAdd))
        {
            patternCount.put(stringToAdd,patternCount.get(stringToAdd)+1);
        }
        else
        {
            patternCount.put(stringToAdd,1);
        }
        System.out.println(patternCount);
    }
}
