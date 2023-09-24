package main.java.Array_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13_2828_1S {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("aaaa", "bbbb", "CCCC"));
        String S = ("abc");
        StringBuilder T = new StringBuilder();
        for (String w : word) T.append(w.charAt(0));
        System.out.println(T.toString().toLowerCase().equals(S));
    }
}