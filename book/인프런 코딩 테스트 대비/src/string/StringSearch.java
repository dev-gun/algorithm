package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 문자 찾기
public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toUpperCase();
        char keyword = in.next().toUpperCase().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == keyword) {
                count++;
            }
        }
        System.out.println(count);
    }
}