package main.java.Array_1;

import java.util.HashMap;
//друзья
public class Task5_1512_1H {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] guestList = {1, 2, 3, 3, 2, 1};
        int ans = 0;

        //Происходит цикл по всем элементам массива guestList.
        for (int friend : guestList) {
            //Вызывается метод getOrDefault() объекта HashMap,
            // чтобы получить текущее количество вхождений идентификатора в массиве.
            // Если идентификатор еще не был добавлен в HashMap, то метод возвращает значение по умолчанию, равное 0.
            int friendCount = hm.getOrDefault(friend, 0);
            // friendCount = default
            ans += friendCount;
            //добавляет значение(счетчик) к числу(ключу)
            hm.put(friend, friendCount + 1);
        }
        System.out.println(ans);
    }
}