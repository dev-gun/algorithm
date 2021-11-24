package algorithm.array;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 큰 수 출력하기
public class BigNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        String answer = arr[0] + " ";
        int prev = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > prev) {
                answer += arr[i] + " ";
            }
            prev = arr[i];
        }
        System.out.println(answer);
    }
}
