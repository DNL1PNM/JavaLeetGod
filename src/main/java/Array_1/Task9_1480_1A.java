package main.java.Array_1;

import java.util.Arrays;

public class Task9_1480_1A {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    //Без объявления какой либо дополнительной переменной
    //for (int j= 1;j < nums.length; j++) {
    //nums[j] = nums[j-1]+ nums[j];
    //return nums;
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        // 1 элемент не вычесляется ,чтобы массив с 0 не начинался
        sum[0] = nums[0];
        for (int j = 1; j < n; j++) {
            sum[j] = sum[j - 1] + nums[j];
        }
        return sum;
    }
}
