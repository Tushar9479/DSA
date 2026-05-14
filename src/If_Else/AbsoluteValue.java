package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();

        // 1st way
//        if (n > 0 ) {
//            System.out.println(n);
//        }else {
//            System.out.println(-n);
//        }

        // second way

        if(n < 0) {
            n = -n;
        }
        System.out.println(n);
    }
}
