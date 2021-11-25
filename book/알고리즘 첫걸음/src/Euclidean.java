import java.util.Scanner;

/**
 * 유클리드 호제법(최대공약수 알고리즘)
 * 두 정수에서 작은 수로 큰 수를 빼는 걸 반복해서 두 수가 같아질 때까지 반복하는 알고리즘
 */
public class Euclidean {
    //기본
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sc.close();
//
//        while(a != b) {
//            if(a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        System.out.println(a);
//    }
    //개선 - 반복문
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sc.close();
//
//        while(a != 0 && b != 0) {
//            if(a > b) {
//                a %= b;
//            } else {
//                b %= a;
//            }
//        }
//        System.out.println(a > b ? a : b);
//    }
    //개선 - 재귀
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(eucd(Math.max(a, b), Math.min(a, b)));;
    }
    public static int eucd(int bn, int sn) {
        int r = bn % sn;

        if(r == 0) {
            return sn;
        } else {
            return eucd(sn, r);
        }
    }
}
