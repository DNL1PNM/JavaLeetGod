package main.java.RoadMap;
import java.util.*;

public class Task3_1_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 4,5,1,6,3,8};
        int target = 9;
        List<int[]> result = twoSum(nums, target);
        for (int[] pair : result) {
        System.out.println(Arrays.toString(pair));
    }
    }
    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //Для каждого элемента массива вычисляем "комплемент" - число,
            // которое нужно добавить к текущему элементу, чтобы получить target.
            int complement = target - nums[i];
            //Проверка наличия "комплемента" в мапе:
            if (map.containsKey(complement)) {
                //Проверяем, содержится ли "комплемент" в мапе.
                //Если "комплемент" содержится в мапе,значит мы нашли решение,
                //и мы возвращаем индексы текущего элемента и элемента с "комплементом".
                int[] pair = {map.get(complement), i};
                 pairs.add(pair);
            }
            //Добавление текущего элемента в мапу:
            map.put(nums[i], i);
        }
        return pairs;
    }
}