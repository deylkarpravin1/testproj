package t;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValues {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 50);
        hashMap.put("banana", 20);
        hashMap.put("orange", 40);
        hashMap.put("grape", 20);


        LinkedHashMap<String, Integer> collect = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println(collect);
    }

}
