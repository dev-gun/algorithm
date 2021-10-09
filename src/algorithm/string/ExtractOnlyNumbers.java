package algorithm.string;

import java.util.Scanner;

public class ExtractOnlyNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String result = "";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                result += c;
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}
