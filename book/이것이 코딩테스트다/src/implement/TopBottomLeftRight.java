package implement;

import java.util.*;

/**
 * 상하좌우
 */
public class TopBottomLeftRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in = new Scanner(System.in);
        String[] plan = in.nextLine().split(" ");
        System.out.printf("최종 도착 위치입니다. %s\n", Arrays.toString(solution(n, plan)));
        System.out.printf("최종 도착 위치입니다. %s", Arrays.toString(book(n, plan)));
    }
    /**
     * 직접 풀어본 코드
     * @param n 맵 가로 세로 크기
     * @param plan 이동 계획
     * @return
     */
    public static int[] solution(int n, String[] plan) {
        int posX = 1, posY = 1;

        for (String s : plan) {
            if(s.equals("L")) {
                if(posX == 1) continue;
                posX--;
            } else if(s.equals("R")) {
                if(posX == n - 1) continue;
                posX++;
            } else if(s.equals("U")) {
                if(posY == 1) continue;
                posY--;
            } else if(s.equals("D")) {
                if(posY == n - 1) continue;
                posY++;
            }
        }
        return new int[]{posY, posX};
    }

    /**
     * 책에 나온 예제 참고
     * @param n 맵 가로 세로 크기
     * @param plan 이동 계획
     * @return
     */
    public static int[] book(int n, String[] plan) {
        int posX = 1, posY = 1;

        Map<String, List<Integer>> moveTypes = Map.of(
                "L", List.of(0, -1),
                "R", List.of(0, 1),
                "U", List.of(-1, 0),
                "D", List.of(1, 0)
        );
        for (String s : plan) {
            List<Integer> movePos = moveTypes.get(s);
            int nx = posX + movePos.get(0);
            int ny = posY + movePos.get(1);

            if(nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            posX = nx;
            posY = ny;
        }

        return new int[]{posX, posY};
    }
}
