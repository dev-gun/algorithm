package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 단어 뒤집기
public class StringReverse {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        String[] answers = new String[n];
        for(int i = 0; i < n; i++) {
            String str = in.next();
            answers[i] = new StringBuilder(str).reverse().toString();
        }
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
