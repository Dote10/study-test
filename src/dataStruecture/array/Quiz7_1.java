package dataStruecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz7_1 {

    public int [] solution(int [] nums ,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

       return null;
    }

    public static void main(String[] args) {

        Quiz7_1 T = new Quiz7_1();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

       int []  result = T.solution(arr,target);
        System.out.println(Arrays.toString(result));

    }
}
