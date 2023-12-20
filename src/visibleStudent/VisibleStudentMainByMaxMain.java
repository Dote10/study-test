package visibleStudent;

import java.util.Scanner;

public class VisibleStudentMainByMaxMain {
    public int sloution(int n, int[] arr){
        int answer = 1, max = arr[0];

        for(int i = 0 ; i < n ; i++){
            answer = max >= arr[i]? answer: answer+1;
            max = max < arr[i]? (int)arr[i] : max;
        }

        return answer;
    }

    public static void main(String[] args) {
    VisibleStudentMainByMaxMain T = new VisibleStudentMainByMaxMain();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

       System.out.println(T.sloution(n,arr));
    }
}
