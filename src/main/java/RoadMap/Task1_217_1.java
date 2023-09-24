package main.java.RoadMap;
import java.util.HashSet;
import java.util.Set;

public class Task1_217_1 {
    public static void main(String[] args) {
        //В главном методе массив целых чисел nums инициализируется четырьмя элементами.
        int[] nums = {2, 7, 11, 15};
        //Затем вызывается метод containDuplicate с массивом nums в качестве аргумента
        //и возвращаемое значение выводится на консоль.
        System.out.println(containDuplicate(nums));
    }
//Метод containDuplicate принимает массив целых чисел в качестве входных данных
// и возвращает логическое значение, указывающее, содержит ли массив дублирующиеся элементы
    public static boolean containDuplicate(int[] nums) {
        //Для этого создается HashSet целых чисел с именем numSet
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            //Проверяем, есть ли в массиве numSet с таким номером num
            if (numSet.contains(num)) {
                return true;
            } else {
                //Добавляем номер num в HashSet
                numSet.add(num);
            }
        }
        return false;
    }
}
