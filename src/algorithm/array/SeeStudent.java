package algorithm.array;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 보이는 학생
public class SeeStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int cnt = 1;
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(prev < arr[i]) {
                cnt++;
                prev = arr[i];
            }
        }
        System.out.println(cnt);
    }
}
