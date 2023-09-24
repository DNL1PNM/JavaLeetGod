package main.java.Array_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task6_1431_1H {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] candies = {1, 2, 4, 4, 2, 1};
        int extraCandies = 2;
        int maxCandy = 0;
        for(int candy : candies){
            if(candy > maxCandy) {
                maxCandy = candy;
            }
        }
        //Класс ArrayList является одной из реализаций интерфейса List в Java.
        //Это изменяемый массив, который может динамически увеличиваться или уменьшаться
        //при добавлении или удалении элементов.
        List<Boolean> result = new ArrayList<>();
        for (int currentCandy : candies) {
            if(currentCandy + extraCandies >= maxCandy){
                result.add(true);
            } else {
                result.add(false);
                //Таким образом, переменная "result" может использоваться для вызова методов,
                // определенных в интерфейсе List, таких как add(), remove(), get() и др.
            }
        }
        System.out.println(result.toString());
    }
}
