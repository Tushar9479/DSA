package If_Else;

import java.util.Scanner;

public class ternaryBasic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print Number :");
        int n = sc.nextInt();

        // condition ? sach : jhoot
        System.out.println((n%2 == 0) ? "Even" : "Odd");

    }
}
