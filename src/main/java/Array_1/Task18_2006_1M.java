package main.java.Array_1;

public class Task18_2006_1M {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        System.out.println(countPairs(nums, k));
    }

    public static int countPairs(int[] nums, int k) {
        int cnt = 0;
        for(int i= 0; i< nums.length ; i++){
            //первое число
            for (int j=i+1; j<nums.length;j++){
                //второе число
                if((Math.abs(nums[i] - nums[j])) == k) cnt++;
            }
        }
        return cnt;
    }
}
