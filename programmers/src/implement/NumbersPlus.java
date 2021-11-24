package algorithm.implement;

/**
 * 문제: 자릿수 더하기
 * 프로그래머스: https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class NumbersPlus {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }
    public static int solution(int n) {
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
