package Pattern_Printing;

import java.util.Scanner;

public class FloydsTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1 ; j <= n; j++){
                if(j <= i){
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
