package Loops;

import java.util.Scanner;

public class compositeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        boolean flag = true; // true means prime
        int i = 1;

        for ( i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
               flag = false;
               break;
            }
        }
        if (n == 1){
            System.out.println("Neither Prime nor Composite");
        }
        else if (flag == false){
            System.out.println("Composite Number");
            for (i = 1 ; i <= Math.sqrt(n); i++){
                if (n % i == 0) {
                    System.out.print(i);
                    if (i != n / i) {
                        System.out.print(n / i);
                    }
                }
            }

        }
        else{
            System.out.println("Prime Number");
        }

    }
}
