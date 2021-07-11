package algorithm.implement;

import java.util.Scanner;

public class Vision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int count = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    if(String.format("%d %d %d", i, j, k).contains("3")) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}
