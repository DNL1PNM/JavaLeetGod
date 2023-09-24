package main.java.OtherTasks;

import java.util.Scanner;

public class Task00_0000_TimeF {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            int seconds = id.nextInt();
            int hours = seconds / 3600 % 24;
            int minutes = seconds / 60 % 60;
            int rSeconds = seconds % 60;
            System.out.printf("%02d:%02d:%02d%n", hours, minutes, rSeconds);
        }
    }

