package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 가장 짧은 문자거리
public class ShortestDistance {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(" ");
        String s = strs[0];
        char t = strs[1].charAt(0);

        int p = 1000;

        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t) {
                p += 1;
            } else {
                p = 0;
            }
            arr[i] = p;
        }
        p = 1000;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != t) {
                p += 1;
            } else {
                p = 0;
            }
            if(arr[i] > p) {
                arr[i] = p;
            }
        }
        //output
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
