package dataStruecture.array;

import java.util.*;
import java.util.function.Consumer;

public class Quiz10 {

    public int solution(int [] nums) {
        Arrays.sort(nums);
        List<Integer> pair = new ArrayList<>();
        int sum =0;

        for(int n: nums){
            pair.add(n);
            //페어 변수에 값이 2개 채워지면 min을 합산하고 변수 초기화
            if(pair.size()==2){
                sum += Collections.min(pair);
                pair.clear();
            }
        }

       return sum;
    }

    public static void main(String[] args) {

        Quiz10 q = new Quiz10();

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
