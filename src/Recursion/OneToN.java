package Recursion;

import java.util.Scanner;

public class OneToN {
    static int n;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
//        print(1);
//        print(1,n);
    }

//************M3***************
// call back use ho rha hai
    public static void print(int n){
        if(n==0) return; // base case
        print(n-1); //work
        System.out.print(n + " "); // call

    }
//************M2***************
//    public static void print(int x){
//        if(x>n) return;
//        System.out.print(x + " ");
//        print(x+1);
//    }

//************M1***************
//    public static void print(int x,int n){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1,n);
//    }
}
