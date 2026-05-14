package Basic_Cheeze;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;

        System.out.println("Area is: ");
        System.out.println(a);
    }
}
