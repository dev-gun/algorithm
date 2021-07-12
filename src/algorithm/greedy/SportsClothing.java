package algorithm.greedy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SportsClothing {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();

        for(int l : lost) {
            lostSet.add(l);
        }
        for(int r : reserve) {
            if(!lostSet.remove(r)) {
                reserveSet.add(r);
            }
        }

        n -= lostSet.size();
        for(int borrow : lostSet) {
            for(Iterator<Integer> itr = reserveSet.iterator(); itr.hasNext();){
                int rent = itr.next();
                if(borrow + 1 == rent || borrow - 1 == rent) {
                    n++;
                    itr.remove();
                    break;
                }
            }
        }
        return n;
    }
}
