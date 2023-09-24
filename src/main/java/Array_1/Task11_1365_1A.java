package main.java.Array_1;

import java.util.Arrays;

public class Task11_1365_1A {
    public static void main(String[] args) {
        int[] nums = {8, 1, 3, 2, 2};
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count += 1;
                }
            }
            array[i] = count;
        }
        System.out.println(Arrays.toString(array));
    }
}