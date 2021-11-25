package array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };
        int cnt = 0;

        for (int i = 0; i < a.length; i++) {
            cnt += a[i];
        }
        System.out.printf("cnt = %d\n", cnt);
    }
}
