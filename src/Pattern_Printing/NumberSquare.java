package Pattern_Printing;

import java.util.Scanner;

public class NumberSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++ ){
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
}
