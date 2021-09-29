package algorithm.string;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toUpperCase();
        char keyword = in.next().toUpperCase().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == keyword) {
                count++;
            }
        }
        System.out.println(count);
    }
}