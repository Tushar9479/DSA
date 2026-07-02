package GeeksOfGeeksProblem;

public class TowerOfHanoi {
    class Solution {
        static int count;
        public int towerOfHanoi(int n, int from, int to, int aux) {
            count = 0;
            hanoi(n,'A','B','C');
            return count;
        }
        private static void hanoi(int n, char src, char helper, char dest) {
            if(n==0) return;
            hanoi(n-1,src,dest,helper);
            count++;
            hanoi(n-1,helper,src,dest);
        }
    }

}
