package Loops;

import java.util.Scanner;

public class sumOfDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (n != 0){
            int lastDigit = n % 10;
           sum += lastDigit;
           n /= 10;
        }
        System.out.println((sum > 0) ? sum : -sum);
    }
}
