package algorithm.array;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 가위바위보
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            String result;
            if(a[i] == b[i]) {
                result = "D";
            } else if(a[i] == 1 && b[i] == 3) {
                result = "A";
            } else if(a[i] == 2 && b[i] == 1) {
                result = "A";
            } else if(a[i] == 3 && b[i] == 2) {
                result = "A";
            } else {
                result = "B";
            }
            System.out.println(result);
        }
    }
}