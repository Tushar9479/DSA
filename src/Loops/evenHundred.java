package Loops;

import java.util.Scanner;

public class evenHundred {
    static void main(String[] args) {
//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 2 == 0){
//                System.out.println(i + " ");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i * n );
//        }
//        for (int i = n; i >= 1 ; i--) {
//            System.out.print(i);
//        }

//        for ( int i = 2; i <= 3*n-1; i+=3){
//            System.out.println(i);
//        }


          System.out.println("Enter a :");
          int a = sc.nextInt();
          System.out.println("Enter difference :");
          int d = sc.nextInt();
          for (int i = 1; i <= n; i++){
              System.out.print(a + " ");
              a += d;
          }

    }
}
