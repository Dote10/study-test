package dataStruecture.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz7Improve_1 {
    public int[] solution(int[] nums, int target) {
        //키와 값을 바꿔서 맵으로 저장
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        //target에서 첫 번째 수를 뺀 결과를 키로 조회하고 현재 인덱스가 아닌 경우 정답으로 리턴
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i]))
                return new int[]{i, numsMap.get(target - nums[i])};
        }

        //항상 정답이 존재 하므로 널이 리턴되는 경우는 없다.
        return  null;
    }



    public static void main(String[] args) {

        Quiz7Improve_1 T = new Quiz7Improve_1();

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
