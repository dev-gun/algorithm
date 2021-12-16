package implement;

import java.util.Scanner;

/**
 * 시각
 */
public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }

    /**
     * 00:00:00시부터 n:59:59시까지 3이 몇개 포함되어 있는지를 확인
     * @param n 종료 시간
     * @return
     */
    public static int solution(int n) {
        int cnt = 0;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String time = String.format("%02d:%02d:%02d", i, j, k);

                    if(time.contains(String.valueOf(3))) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
