package main.java.RoadMap;
import java.util.HashMap;
import java.util.Map;

public class Task2_242_2 {
    public static void main(String[] args) {
        System.out.println(containDuplicate("abba", "baba"));
    }

    public static boolean containDuplicate(String s, String t) {
        //Мы создаем новый объект HashMap для хранения частот символов в строках
        Map<Integer, Integer> freqs = new HashMap<>();
        //1.Мы проходим по каждому символу строки s и увеличиваем соответствующее значение в Map.
        //2.Метод chars() возвращает поток символов в строке s, который мы передаем в метод forEach().
        //3.Внутри лямбда-выражения мы извлекаем текущий символ ch и используем метод getOrDefault()
        //для получения текущего значения частоты символа в Map, или 0, если символ еще не встречался
        //Затем мы увеличиваем значение на 1 и помещаем его обратно в Map.
        //4.Затем мы увеличиваем значение на 1 и помещаем его обратно в Map.
        s.chars().forEach(ch -> freqs.put(ch, freqs.getOrDefault(ch, 0) + 1));
        t.chars().forEach(ch -> freqs.put(ch, freqs.getOrDefault(ch, 0) - 1));
        //5.Мы получаем коллекцию всех значений в Map и создаем поток Stream из этой коллекции
        //6.Затем мы используем метод allMatch(), чтобы проверить, что все значения равны 0.
        //Если это так, то возвращаем true, иначе возвращаем false.
        return freqs.values().stream().allMatch(x -> x == 0);
    }
}