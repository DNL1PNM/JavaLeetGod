package main.java.RoadMap;

import java.util.Arrays;

public class Task2_242_1 {
    public static void main(String[] args) {
        System.out.println(containDuplicate("abba", "baba"));
    }

    public static boolean containDuplicate(String s, String t) {
        //Проверьте, имеют ли s и t одинаковую длину
        if(s.length()!= t.length()) return false;
        //Преобразуйте строки s и t в списки символов.
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        //Отсортируйте списки символов s и t.
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        //Сравните отсортированные списки. Если они равны, верните True. В противном случае верните False.
        return Arrays.equals(sArray, tArray);
    }
}
