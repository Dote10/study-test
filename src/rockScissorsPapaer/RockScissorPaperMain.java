package rockScissorsPapaer;

import java.util.Scanner;

public class RockScissorPaperMain {

    public void solution(int n,int [] arrA, int[]arrB){
        char  answer = 'A';

        for(int i = 0; i <n; i++){

            System.out.println(answer);
        }
        
    }

    public static void main(String[] args) {

        RockScissorPaperMain T = new RockScissorPaperMain();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] aArr = new int[n];
        int [] bArr = new int[n];
        for (int i = 0 ; i < n; i++){
            aArr[i] = sc.nextInt();
            bArr[i] = sc.nextInt();
        }

        T.solution(n,aArr,bArr);

    }

}
