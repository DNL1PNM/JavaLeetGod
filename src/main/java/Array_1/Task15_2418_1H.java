package main.java.Array_1;
import java.util.*;
public class Task15_2418_1H {
        public static void main(String[] args) {
            String[] names = {"Alice", "Bob", "Eve"};
            int[] heights = {150, 180, 160};
            String[] sortedNames = sortPeople(names, heights);

            System.out.println(Arrays.toString(sortedNames)); // Output: [Bob, Eve, Alice]
        }
    public static String[] sortPeople(String[] names, int[] heights) {
        int l = heights.length;

        Map<Integer,String> map = new HashMap<>();

        for(int i=0; i<l;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans= new String[l];

        for(int i=l-1, j=0 ; i>=0; i--){
            ans[j++] = map.get(heights[i]);
        }
        return ans;
    }
    }

