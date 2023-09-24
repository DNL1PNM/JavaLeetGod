package main.java.Array_1;

import java.util.Arrays;

public class Task12_1389_1A {
    public static void main(String[] args) {
        int[] index = {0, 1, 2, 2, 1};
        int[] nums = {1, 2, 3, 6, 4};
        int[] array = new int[index.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > index[i]; j--) {
                array[j] = array[j - 1];
            }
            array[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
