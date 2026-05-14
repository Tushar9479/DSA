package Loops;

import java.util.Scanner;

public class reverseOfNumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        int r = 0;
        while (n != 0){
            r *= 10;
            r += (n % 10);
            n /= 10;
        }
        System.out.println(r);
    }
}

//n = 1 2 9 6
//r = 6 9 2 1
//
//6000 + 900 + 20 + 1
//
//
//steps: 6 -> 60 -> 69 -> 690 -> 692 -> 6920 -> 6921
//            *10   +9    *10    +2     *10     +1

// algo
//r = 0
//r *= 10
//r += (n % 10)
//n /= 10