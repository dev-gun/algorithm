package algorithm.array;

import java.util.Arrays;
import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 피보나치 수열
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            int prev = arr[i - 1];
            int preprev = arr[i - 2];
            arr[i] = (prev + preprev);
        }
        System.out.println(Arrays.toString(arr).replaceAll("]", "").replaceAll("\\[", "").replaceAll(",", ""));
    }
}