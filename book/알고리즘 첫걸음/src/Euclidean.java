import java.util.Scanner;

/**
 * 유클리드 호제법(최대공약수 알고리즘)
 * 두 정수에서 작은 수로 큰 수를 빼는 걸 반복해서 두 수가 같아질 때까지 반복하는 알고리즘
 */
public class Euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println(a);
    }
}
