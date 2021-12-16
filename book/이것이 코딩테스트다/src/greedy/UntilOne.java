package greedy;

import java.util.Scanner;

/**
 * 1이 될 때까지
 */
public class UntilOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.printf("반복 수 : %d", solution(n, k));
    }

    /**
     *
     * @param n 1이 되어야 하는 수
     * @param k 나누는 수
     * @return
     */
    public static int solution(int n, int k) {
        int cnt = 0;
        while(n != 1){
            if(n % k == 0) {
                n /= k;
            } else {
                n--;
            }
            cnt++;
        }

        return cnt;
    }
}