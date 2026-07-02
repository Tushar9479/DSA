package Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    static int n;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
    }


    public static void print(int n){
//        if (n==1){
//            System.out.println(n+" ");
//            return;
//        }
        if(n==0) return;
        System.out.print(n + " ");
        print(n-1);
        if(n!=1) System.out.print(n + " ");
    }
}
