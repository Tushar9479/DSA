package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP:");
        int cp = sc.nextInt();
        System.out.println("Enter SP:");
        int sp = sc.nextInt();
         // Method 1
//        if(sp > cp) System.out.println("Profit is " + (sp - cp));
//        if(sp < cp) System.out.println("Loss is " + (cp - sp));
//        if(sp == cp) System.out.println("No profit and No Loss");

        // Method 2
        if(sp > cp){
            System.out.println("Profit is " + (sp - cp));
        }
        else if (sp < cp) {
            System.out.println("Loss is " + (cp - sp));
        }
        else {
            System.out.println("No profit and No Loss");
        }
    }
}
