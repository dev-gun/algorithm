package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 유효한 회문(팰린드롬)
public class VaildPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String temp = new StringBuilder(str).reverse().toString();

        String result = "NO";
        if(str.equals(temp)) {
            result = "YES";
        }
        System.out.println(result);
    }
}
