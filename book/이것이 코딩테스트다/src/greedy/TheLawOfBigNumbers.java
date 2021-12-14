package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 큰 수의 법칙
 */
public class TheLawOfBigNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.printf("단순하게 푼 큰 수의 법칙 : %d\n", solution1(n, m, k, arr));
        System.out.printf("수열을 활용한 큰 수의 법칙 : %d", solution2(n, m, k, arr));
    }
    /**
     * 단순하게 푸는 큰 수의 법칙
     * @param n 배열의 크기
     * @param m 숫자가 더해지는 횟수
     * @param k 연속으로 더해질 수 있는 횟수
     * @param arr 대상 배열
     * @return
     */
    public static int solution1(int n, int m, int k, int[] arr) {
        Arrays.sort(arr);
        int first = arr[n - 1];
        int second = arr[n - 2];

        int sum = 0;
        while(true) {
            for (int i = 0; i < k; i++) {
                if(m == 0) break;
                sum += first;
                m--;
            }
            if(m == 0) break;
            sum += second;
            m--;
        }
        return sum;
    }
    /**
     * 수열을 활용한 큰 수의 법칙
     * @param n 배열의 크기
     * @param m 숫자가 더해지는 횟수
     * @param k 연속으로 더해질 수 있는 횟수
     * @param arr 대상 배열
     * @return
     */
    public static int solution2(int n, int m, int k, int[] arr) {
        Arrays.sort(arr);
        int first = arr[n - 1];
        int second = arr[n - 2];

        int count = (m / (k + 1)) * k;
        count += m % (k + 1);

        int result = 0;
        result += count * first;
        result += (m - count) * second;

        return result;
    }
}