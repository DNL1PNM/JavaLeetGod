package main.java.Array_1;

import java.util.Arrays;

public class Task7_1672_1M {

    public static void main(String[] args) {
        //присваивание значений в фигурных скобках
    int[][] accounts =  {{1,5},{7,3},{3,5}};
    //макс будет меньеш всех при 0
    int max = -1;

    for(int i=0; i<accounts.length; i++){
        int sum = 0;
        for (int j=0; j<accounts[i].length; j++){
            System.out.println(accounts[i][j]);
            sum+= accounts[i][j];
        }
        //Math.max() - это статический метод класса Math,
        //который возвращает максимальное из двух чисел.
        max = Math.max(max, sum);
    }
    System.out.println(max);
}
}
