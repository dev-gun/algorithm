package algorithm.string;

import com.sun.tools.javac.Main;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 회문 문자열
public class PalindromeCharacters {
    public String solution1(String str) {
        str = str.toUpperCase();
        String result = "YES";
        for (int i = 0; i < (str.length()/2); i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = "NO";
                break;
            }
        }
        return result;
    }
    public String solution2(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if(str.equalsIgnoreCase(sb.toString())) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        PalindromeCharacters main = new PalindromeCharacters();
        System.out.println(main.solution1(str));
        System.out.println(main.solution2(str));
    }
}