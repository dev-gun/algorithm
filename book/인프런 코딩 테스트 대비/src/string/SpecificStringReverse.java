package algorithm.string;

import java.util.Scanner;

//인프런-자바(Java) 알고리즘 문제풀이 : 코딩테스트 대비
//문제 : 특정 문자 뒤집기
public class SpecificStringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        char[] arr = input1.toCharArray();
        int left = 0;
        int right = input1.length() - 1;
        while (left < right) {
            if(!Character.isAlphabetic(arr[left])) {
                left++;
            } else if (!Character.isAlphabetic(arr[right])) {
                right--;
            } else {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}