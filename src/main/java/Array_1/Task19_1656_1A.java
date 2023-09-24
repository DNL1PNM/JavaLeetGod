package main.java.Array_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task19_1656_1A {
        private final String[] data;
        private int ptr;

        public Task19_1656_1A(int n) {
            data = new String[n + 1];
            ptr = 1;
        }
        public static void main(String[] args) {
            Task19_1656_1A os = new Task19_1656_1A(5);
        System.out.println(Arrays.toString(os.insert(3, "ccccc"))); // Вывод: []
        System.out.println(Arrays.toString(os.insert(1, "aaaaa"))); // Вывод: ["aaaaa"]
        System.out.println(Arrays.toString(os.insert(2, "bbbbb"))); // Вывод: ["bbbbb", "ccccc"]
        System.out.println(Arrays.toString(os.insert(5, "eeeee"))); // Вывод: []
        System.out.println(Arrays.toString(os.insert(4, "ddddd"))); // Вывод: ["ddddd", "eeeee"]
    }
        public String[] insert(int idKey, String value) {
            data[idKey] = value;
            List<String> res = new ArrayList<>();
            for (int i = ptr; i < data.length; i++) {
                if (data[i] != null) {
                    res.add(data[i]);
                } else {
                    ptr = i;
                    break;
                }
            }
            return res.toArray(new String[0]);
        }
    }
