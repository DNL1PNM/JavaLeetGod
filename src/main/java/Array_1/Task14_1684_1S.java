package main.java.Array_1;

import java.util.HashSet;
import java.util.Set;

public class Task14_1684_1S {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[]{"ad", "bd", "aaab", "baa", "badab"};

        Set<Character> allowedChars = new HashSet<>();
        int Count = 0;

        for (char c : allowed.toCharArray()) {
            allowedChars.add(c);
        }

        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                Count++;
            }
        }

        System.out.println(Count);
    }
}
