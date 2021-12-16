package implement;

import java.util.List;
import java.util.Scanner;

/**
 * 왕실의 나이트
 */
public class RoyalNight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pos = in.next();
        System.out.printf("나이트가 이동할 경우의 수는 %d개", solution(pos));
    }

    /**
     * 나이트가 이동할 수 있는 경우의 수를 반환
     * @param pos 현재 나이트의 좌표
     * @return
     */
    public static int solution(String pos) {
        //a의 10진 코드가 97부터 시작하니 96을 빼줌
        int posX = pos.charAt(0) - 96;
        int posY = Integer.parseInt(pos.substring(1));
        List<List<Integer>> moves = List.of(
                List.of(2, 1),
                List.of(2, -1),
                List.of(-2, 1),
                List.of(-2, -1),
                List.of(-1, 2),
                List.of(1, 2),
                List.of(-1, -2),
                List.of(1, -2)
        );
        int cnt = 0;
        for (int i = 0; i < moves.size(); i++) {
            int moveX = posX + moves.get(i).get(0);
            int moveY = posY + moves.get(i).get(1);

            if((1 <= moveX && 8 >= moveX) && (1 <= moveY && 8 >= moveY)) {
                cnt++;
            }
        }
        
        return cnt;
    }
}