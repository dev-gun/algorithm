package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 암호
public class CheolsuYoungheePassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next()
                .replaceAll("#", "1")
                .replaceAll("\\*", "0");

        String answer = "";
        for(int i = 0; i < n; i++) {
            int decode = Integer.parseInt(str.substring(0, 7), 2);
            char value = (char) decode;
            answer += value;
            str = str.substring(7);
        }
        System.out.println(answer);
    }
}
