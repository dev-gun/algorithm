package greedy;

import java.util.Scanner;

/**
 * 숫자 카드 게임
 */
public class NumberCardGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                row[j] = in.nextInt();
            }
            arr[i] = row;
        }
        System.out.printf("열의 최소값 중 최대값은 %d", solution(n, m, arr));
    }
    /**
     * 2중 반복문을 이용한 방법
     * @param n 행의 갯수
     * @param m 열의 갯수
     * @param arr 카드 배열
     */
    public static int solution(int n, int m, int[][] arr) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int[] row = arr[i];
            int min = 10001;
            for (int j = 1; j < m; j++) {
                min = Math.min(row[j], min);
            }
            result = Math.max(result, min);
        }
        return result;
    }
}
