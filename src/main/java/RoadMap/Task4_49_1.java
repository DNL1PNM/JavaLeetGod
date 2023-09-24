package main.java.RoadMap;

import java.util.*;

public class Task4_49_1 {
    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = Anagrams(strings);
        for (List<String> pair : result) {
            System.out.println(Arrays.toString(new List[]{pair}));
        }
    }
        public static List<List<String>> Anagrams(String[] strs){
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }

                map.get(sortedWord).add(word);
            }

            return new ArrayList<>(map.values());

    }
}