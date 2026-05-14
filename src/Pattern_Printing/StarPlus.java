package Pattern_Printing;

import java.util.Scanner;

public class StarPlus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m=n/2+1;
//        double b = Math.ceil(n/2);
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=n; j++){
               if (i == m || j == m){
                   System.out.print("* ");
               }else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
