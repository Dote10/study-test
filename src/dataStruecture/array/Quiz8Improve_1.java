package dataStruecture.array;

import java.util.Scanner;

public class Quiz8Improve_1 {

    public int solution(int [] height) {
        int left = 0;
        int leftMax = height[left];

        int right = height.length - 1;
        int rightMax = height[right];

        int volume = 0;

        while (left != right){

            //leftMax와 rightMax가 여기 있어야 하는 이유는
            // 1.left 혹은 right 포인터의 위치를 옮긴 이후에
            // 각각의 위치를 갱신해주어 야 한다.
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);

            rightMax = height[right] > rightMax ? height[right] : rightMax;

            if(leftMax <= rightMax){
                volume += leftMax - height[left];
                left +=1;
            }else{
                volume += rightMax - height[right];
                right -=1;
            }
        }

       return volume;
    }

    public static void main(String[] args) {

        Quiz8Improve_1 q = new Quiz8Improve_1();

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
