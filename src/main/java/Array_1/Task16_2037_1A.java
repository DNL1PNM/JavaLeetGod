package main.java.Array_1;
import java.util.Arrays;

public class Task16_2037_1A {
    public static void main(String[] args) {
        int[] seats = {1, 3, 5};
        int[] students = {2, 4, 7};
        System.out.println(minMoves(seats, students));
    }

    public static int minMoves(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(seats[i] - students[i]);
        }

        return totalMoves;
    }
}
