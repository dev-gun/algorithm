package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 숫자만 추출
public class ExtractOnlyNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String result = "";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                result += c;
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}
