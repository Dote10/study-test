package dataStruecture.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz9Improve_1 {

    public List<List<Integer>> solution(int [] nums) {
        int sum, left, right;
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            //중복된 값 건너 뛰기
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

        //간격을 좁혀며 합 sum 계산
        left = i + 1;
        right = nums.length -1;
        while(left < right) {
            sum = nums[i] + nums[left] + nums[right];
                //합이 0보다 작다면 왼쪽 포인터 이동
                if (sum < 0)
                    left += 1;
                //합이 0보다 크면 오른쪽 포인터 이동
                else if (sum > 0)
                    right -= 1;
                else {
                    //합인 경우 정답 List에 해당하는 값들을 넣어준다.
                    results.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //left 포인터가 연속으로 같은 수로 되어 있을때는 한칸씩 오른쪽으로 이동
                    while (left < right && nums[left] == nums[left + 1])
                        left += 1;
                    //right 포인터가 연속으로 같은 수로 되어 있을때는 한칸씩 왼쪽으로 이동
                    while (left < right && nums[right] == nums[right - 1])
                        right -= 1;

                    //i를 기준으로 정답이 나온 상태에서
                    //연속된 숫자가 있을 경우 while문을 사용해 모두 한칸씩 이동한 시켰으므로
                    //양쪽 모두 이동해야 새로운 조합의 0을 찾을 수 있다.
                    left += 1;
                    right -= 1;
                }

            }
        }

        return results;
    }

    public static void main(String[] args) {

        Quiz9Improve_1 q = new Quiz9Improve_1();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }



        List<List<Integer>> results = q.solution(arr);

        System.out.println(results.toString());

    }
}
