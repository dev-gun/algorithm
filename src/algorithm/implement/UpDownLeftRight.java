package algorithm.implement;

import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int n = sc.nextInt();

        String[] planner = sc2.nextLine().split(" ");

        System.out.println(solution(n, planner));
    }
    public static String solution(int n, String[] planner) {
        int posX = 1;
        int posY = 1;

        for (String msg : planner) {
            switch (msg) {
                case "U":
                    posX = posX - 1 >= 1 ? posX - 1 : posX;
                    break;
                case "D":
                    posX = posX + 1 <= n ? posX + 1 : posX;
                    break;
                case "L":
                    posY = posY - 1 >= 1 ? posY - 1 : posY;
                    break;
                case "R":
                    posY = posY + 1 <= n ? posY + 1 : posY;
                    break;
            }
        }

        return String.format("%s %s", posX, posY);
    }
}