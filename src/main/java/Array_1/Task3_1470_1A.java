package main.java.Array_1;

import java.util.Arrays;

public class Task3_1470_1A {
    public static void main(String[] args) {
        //инициализация
        int n = 3;
        int[] nums = {1, 2, 3, 4, 5, 6,};
        int[] res = new int[n * 2];
        int j = 0;
        //
        for (int i = 0; i < res.length - 1; i += 2) {
            res[i] = nums[j++];
            res[i + 1] = nums[n++];
        }
        //печать и в строку преобразование
        System.out.println(Arrays.toString(res));
    }
}
