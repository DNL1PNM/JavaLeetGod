package main.java.Array_1;

public class Task10_2114_2S {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int max = 0;
        for (String sentence : sentences) {
            System.out.println(Math.max(max, (sentence.split(" ")).length));
        }
    }
}
