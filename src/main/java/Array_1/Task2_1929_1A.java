package main.java.Array_1;

import java.util.Arrays;

public class Task2_1929_1A {
    public static void main(String[] args) {
        //массив инициализируется 4 элементами
        int[] nums = {1, 2, 3, 4, 5, 6};
        //новый массив увеличивается в 2 раза
        int[] res =new int [nums.length * 2];
        System.arraycopy(nums, 0, res, 0, nums.length);
        //копирует его элементы в новый массив
        for(int i = 0, j = nums.length; i < nums.length; i++, j++) {
            res[j] = nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
