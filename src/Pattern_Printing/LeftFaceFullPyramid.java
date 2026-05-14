package Pattern_Printing;

import java.util.Scanner;

public class LeftFaceFullPyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n + (n - 1); i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= (n + 1) - i && j <= (n - 1) + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
