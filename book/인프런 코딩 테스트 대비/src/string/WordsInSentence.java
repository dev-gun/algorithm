package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 문장 속 단어
public class WordsInSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");

        int longStrIdx = 0;
        for(int i = 1; i < words.length; i++) {
            if(words[i].length() > words[longStrIdx].length()) {
                longStrIdx = i;
            }
        }
        System.out.println(words[longStrIdx]);
    }
}
