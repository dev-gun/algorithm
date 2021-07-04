package algorithm.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumberCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] range = a.split(" ");

        //행 수
        int n = Integer.parseInt(range[0]);
        //열 수
        int m = Integer.parseInt(range[1]);

        int[][] nums = new int[m][n];
        for(int i = 0; i < n; i++) {
            nums[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(n, m, nums));
    }
    public static int solution(int n, int m, int[][] nums) {
        int[] smallNums = new int[m];
        for(int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
            smallNums[i] = nums[i][0];
        }
        Integer[] result = Arrays.stream(smallNums).boxed().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return result[0];
    }
}