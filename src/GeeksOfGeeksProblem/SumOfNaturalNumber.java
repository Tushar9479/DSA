package GeeksOfGeeksProblem;
import java.util.Scanner;
public class SumOfNaturalNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(findSum(n));
        }

        public static int findSum(int n){
            if(n==0) return 0;
            if(n==1) return 1;
            return n + findSum(n-1);
        }
}

