package dataStruecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz7Improve_3 {
    public int[] solution(int[] nums, int target) {
       int left = 0;
       int right = nums.length - 1;

       while (left != right){
           int item = nums[left] + nums[right];
           if(item > target) {
               right -=1;
           } else if (item < target ) {
               left +=1;
           }else {
               return new int[]{left, right};
           }

       }

        //항상 정답이 존재 하므로 널이 리턴되는 경우는 없다.
        return  null;
    }



    public static void main(String[] args) {

        Quiz7Improve_3 T = new Quiz7Improve_3();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result [] = T.solution(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
