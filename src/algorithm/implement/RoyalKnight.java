package algorithm.implement;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoyalKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pos = sc.next();

        System.out.println(solution(pos));
    }
    public static int solution(String pos) {
        int posX = pos.charAt(0)-96;
        int posY = Integer.parseInt(pos.substring(1));

        int[] moveX = new int[]{2, 2, -2, -2, 1, -1, 1, -1};
        int[] moveY = new int[]{1, -1, 1, -1, 2, 2, -2, -2};

        int count = 0;
        for(int i = 0; i < moveX.length; i++) {
            int x = posX + moveX[i];
            int y = posY + moveY[i];

            if(x <= 8 && x >= 1 && y >= 1 && y <= 8) {
                count++;
            }
        }
        return count;
    }
}
