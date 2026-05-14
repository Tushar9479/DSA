package Pattern_Printing;

import java.util.Scanner;

public class StarRhombus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + n -1 ; j++){
                if (j >= (n + 1) -i && j <= 2*n - i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
