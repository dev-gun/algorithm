package algorithm.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MockGossa {
    public static void main(String[] args) {
        System.out.print("[");
        for(int a : solution(new int[]{1, 2, 3, 4, 5, 4, 2, 5, 2, 1})) {
            System.out.print(a+", ");
        }
        System.out.println("]");
    }
    public static int[] solution(int[] answers) {
        int[][] players = new int[][] {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[players.length];
        for(int i = 0; i < answers.length; i++) {
            for (int j = 0; j < players.length; j++) {
                int[] player = players[j];
                if (player[i % player.length] == answers[i]) {
                    scores[j]++;
                }
            }
        }
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
