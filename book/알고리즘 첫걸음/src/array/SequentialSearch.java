package array;

import java.util.Scanner;

/**
 * 선형 검색
 */
public class SequentialSearch {
    public static void main(String[] args) {
        int[] a = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if(x == a[i]) {
                pos = i;
                break;
            }
        }
        System.out.printf("pos = %d\n", pos);
    }
}
