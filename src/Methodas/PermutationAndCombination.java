package Methodas;

import java.util.Scanner;

public class PermutationAndCombination {
   public static int fact(int x){
       int fact = 1;
       for (int i = 1; i <= x; i++){
           fact = fact * i;
       }
       return fact;
   }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value or n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();
        int npr = fact(n)/fact(n-r);
        int ncr = fact(n)/(fact(n-r)*fact(r));
        System.out.println("Permutation is :" + npr);
        System.out.println("Combination is :" + ncr);
    }
}
