package dataStruecture.array;

import java.util.*;

public class Quiz10Improve_1 {

    public int solution(int [] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0) sum+=nums[i];
        }

       return sum;
    }

    public static void main(String[] args) {

        Quiz10Improve_1 q = new Quiz10Improve_1();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

       int result = q.solution(arr);
        System.out.println(result);

    }
}
