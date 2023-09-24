package main.java.Array_1;

public class Task10_2114_1S {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int max = 0;
        for(String sentence : sentences)
    {
        String[] words = sentence.split(" ");

        int numWords = words.length;

        if(numWords > max){
            max = numWords;
        }
        System.out.println(max);
    }
    }
}
