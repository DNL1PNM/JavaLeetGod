package main.java.RoadMap;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
//Заметим, что данный код не ищет конкретные дубликаты, а только проверяет, есть ли дубликаты в массиве.
public class Task1_217_2 {
    public static void main(String[] args) {
        //Объявление и инициализация массива
        int[] nums = {2, 7, 11, 15,};
        //1.В этой строке кода мы преобразуем массив nums в множество (Set) numSet
        //2.Метод Arrays.stream(nums) создает поток элементов из массива nums
        //3.Метод Arrays.stream(nums) создает поток элементов из массива nums
        //4.Метод boxed() преобразует каждый элемент потока в объект типа Integer
        //5.Метод collect(Collectors.toSet()) собирает все элементы в множество типа HashSet
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        //сравнивая размер множества numSet с длиной массива nums
        System.out.println(numSet.size() != nums.length);

    }
}
