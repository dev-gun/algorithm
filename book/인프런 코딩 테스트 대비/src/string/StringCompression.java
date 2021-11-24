package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 문자열 압축
public class StringCompression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String answer = "";
        str += " ";
        int cnt = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        System.out.println(answer);
    }
}