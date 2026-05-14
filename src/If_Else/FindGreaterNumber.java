package If_Else;

import java.util.Scanner;

public class FindGreaterNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side :");
        int a = sc.nextInt();

        System.out.println("Enter second side :");
        int b = sc.nextInt();

        System.out.println("Enter third side :");
        int c = sc.nextInt();

        if (a >= b){
            if (a >= c)
                System.out.println("a is greater");
            else
                System.out.println("c is greater");
        }
        else{
             if (b >= c)
                 System.out.println("b is greater");
             else
                 System.out.println("c is greater ");
        }
    }
}
