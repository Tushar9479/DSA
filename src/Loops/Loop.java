package Loops;

import java.util.Scanner;

public class Loop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
            System.out.println(a);
            a = n - i;

        }
    }
}

//package Loops;
//
//import java.util.Scanner;
//
//public class Loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int i = 1;
//        int a = n;
//
//        while (i <= a) {
//            if (i == a) {
//                System.out.println(i);
//            } else {
//                System.out.println(i);
//                System.out.println(a);
//            }
//            i++;
//            a--;
//        }
//    }
//}
