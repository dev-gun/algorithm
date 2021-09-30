package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 대소문자 변환
public class CaseConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                sb.append(Character.toUpperCase(x));
            } else {
                sb.append(Character.toLowerCase(x));
            }
        }
        System.out.println(sb.toString());
    }
}