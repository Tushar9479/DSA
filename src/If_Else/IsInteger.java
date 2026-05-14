package If_Else;

import java.util.Scanner;

public class IsInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        double n = sc.nextDouble();
        int x = (int)n;
//        if (n - (int)n == 0 ) System.out.println("Is an Integer");
        if(n - x == 0) System.out.println("Is an Integer");
        else System.out.println("Not an Integer");


    }
}
