package Methodas;

import java.awt.*;
import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        System.out.println("Maximum :" + Math.max(Math.max(a,b),c));
        System.out.println("Minimum :" + Math.min(Math.min(a,b),c));

//        int d = Math.max(a,b);
//        int e = Math.max(d,c);
//        if (d > e){
//            System.out.println("Greater is :" + d);
//        }
//        else {
//            System.out.println("Greater is :" + e);
//        }


    }
}
