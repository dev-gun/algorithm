package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 중복 문자 제거
public class DuplicateCharactersDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
