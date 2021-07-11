package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.util.stream.Collectors.toList;

/**
 * 문제명 : 큰 수의 법칙
 * 내용 : 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 큰 수의 법칙에 따른 결과를 출력하시오.
 * 큰 수의 법칙 : 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다.
 *              단, 배열 특정 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없고, 서로 다른 인덱스에 해당하는 수가 같은 경우에는 서로 다른 것으로 간주한다.
 * 입력 조건 : 첫째 줄에 N, M, K의 자연가 주어지며, 각 자연수는 공백으로 구분한다.
 *           둘째 줄에 N개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다. 단, 각각의 자연수는 1 이상 10,000 이하의 수로 주어진다.
 * 입력 예시     출력 예시
 * 5 8 3       46
 * 2 4 5 4 6
 * 출력 조건 : 첫째 줄에 큰 수의 법칙에 따라 더해진 답을 출력한다.
 */
public class LawOfLargeNumbers {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] range = a.split(" ");

        int n = Integer.parseInt(range[0]);
        int m = Integer.parseInt(range[1]);
        int k = Integer.parseInt(range[2]);

        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(n, m, k, nums));
    }
    public static int solution(int n, int m, int k, int[] nums) {
        Integer[] sortedNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedNums, Collections.reverseOrder());

        int firstValue = sortedNums[0];
        int secondValue = sortedNums[1];

        int result = 0;
        while(true) {
            for(int i = 0; i < k; i++) {
                if(m == 0) {
                    break;
                }
                result += firstValue;
                m -= 1;
            }
            if(m == 0) {
                break;
            }
            result += secondValue;
            m -= 1;
        }
        return result;
    }
}