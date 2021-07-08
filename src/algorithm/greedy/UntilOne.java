package algorithm.greedy;

import java.util.Scanner;

public class UntilOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] range = a.split(" ");

        int n = Integer.parseInt(range[0]);
        int k = Integer.parseInt(range[1]);

        System.out.println(solution(n, k));
    }
    public static int solution(int n, int k) {
        int count = 0;
        while(n > 1) {
            if(n%k == 0) {
                n /= k;
            }else {
                n -= 1;
            }
            count += 1;
        }
        return count;
    }
}