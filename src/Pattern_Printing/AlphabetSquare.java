package Pattern_Printing;

import java.util.Scanner;

public class AlphabetSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++ ){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}
