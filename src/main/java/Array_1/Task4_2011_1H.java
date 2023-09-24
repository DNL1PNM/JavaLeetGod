package main.java.Array_1;

import java.util.HashMap;
import java.util.Map;

public class Task4_2011_1H {
    public static void main(String[] args) {
        //Создается массив с операциями.
        String operations[] = {"--X","X++","X++"};
        //Создается объект Map под названием operationMap
        Map<String,String> operationMap = new HashMap<>();
        //Создается константа для дальнейшего сравнения в коде
        String ADDITION = "+";
        //Заполняем массив операцями через объект
        operationMap.put("X++","+");
        operationMap.put("++X","+");
        operationMap.put("--X","-");
        operationMap.put("X--","-");
        //op для хранения знака операции
        String op = "";
        //result для хранения результата операции
        int result=0;
        //Заполняем массив
        for(String operation:operations) {
            //Здесь операция operationMap.get(operation) используется для получения знака операции из Map.
            op = operationMap.get(operation);
            //Последняя строка использует тернарный оператор для увеличения или уменьшения переменной result на один,
            //в зависимости от знака операции.
            result = op.equals(ADDITION) ? ++result : --result;

            System.out.println(operation + " (" + result + ")");
        }
        System.out.println(result);
    }
}
