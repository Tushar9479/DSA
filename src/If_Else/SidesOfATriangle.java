package If_Else;

import java.io.IOException;
import java.util.Scanner;

public class SidesOfATriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side :");
        int n = sc.nextInt();

        System.out.println("Enter second side :");
        int m = sc.nextInt();

        System.out.println("Enter third side :");
        int z = sc.nextInt();

        if (n+m>z && m+z>n && z+n>m){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }
    }
}
