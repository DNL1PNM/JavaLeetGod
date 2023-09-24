package main.java.Array_1;

import java.util.Arrays;

public class Task21_1913_1M {
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 5, 7, 8, 9};
        Arrays.sort(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        int prod1 = nums[0] * nums[1];
        System.out.println(nums[nums.length - 1]);
        System.out.println(nums[nums.length - 2]);
        int prod2 = nums[nums.length - 1] * nums[nums.length - 2];
    }
}