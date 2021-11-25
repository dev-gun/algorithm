package array;

import java.util.Scanner;

/**
 * 이진 검색
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 39, 41, 53, 55, 68, 72, 84, 88, 92, 97 };
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int left = 0, right = a.length - 1;
        int middle, pos = -1;

        while(pos == -1 && left <= right) {
            middle = (left + right) / 2;

            if(a[middle] == x) {
                pos = middle;
            } else if(a[middle] > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        System.out.printf("pos = %d", pos);
    }
}