package If_Else;

import java.util.Scanner;

public class LeaderElseif {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
         if(num%5 == 0 && num%3 == 0){
             System.out.println("Number Is divisible by both 5 or 3");
         } else if (num%5 == 0) {
             System.out.println("Number Is divisible by 5");
         } else if (num%3 ==0) {
             System.out.println("Number is Divisible by 3");
         }else {
             System.out.println("Number is Not divisible by 5 or 3");
         }


    }
}
