package main.java.Array_1;

public class Task8_2574_1M {
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 5};
        int n = nums.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }
        //Данная строка кода создает новый массив answer длины n,
        //где n - это длина массива nums, заданного в начале кода.
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            //Math.abs() - это метод класса Math в языке Java, который возвращает модуль числа
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
            System.out.println(answer[i]);
        }
    }
}
