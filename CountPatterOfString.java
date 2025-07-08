package t;

import java.util.HashMap;
import java.util.Map;

public class CountPatterOfString {
    public static void main(String[] args) {
        String str = "XXXZZFFYYZZTTXXZZXX";

        Map<String,Integer> patternCount = new HashMap<>();

        String tempString = "";

        for (int i=0;i<str.length()-1;i++)
        {
            char ch = str.charAt(i);

            if(i==str.length()-1)
            {}

            if(ch == str.charAt(i+1))
            {
                if(i==str.length()-1)
                    tempString= tempString+ch+str.charAt(i+1);
                else
                    tempString = tempString+ch;
            }
            else
            {
                if(i==str.length()-1)
                    tempString= tempString+ch+str.charAt(i+1);
                else
                    tempString = tempString+ch;
                if (patternCount.containsKey(tempString))
                {
                    patternCount.put(tempString,patternCount.get(tempString)+1);
                }
                else
                {
                    patternCount.put(tempString,1);
                }

                tempString = "";
            }
        }

        System.out.println(patternCount);
    }
}
