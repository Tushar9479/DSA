package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = {1,10,-5,70,69,56};
//        for (int i = 0; i <= arr.length; i++){
//            System.out.println(arr[i]);
//        }

        int[] tush = new int [10];

        for (int i = 0; i < tush.length; i++){
            System.out.print("Enter " + (i+1) + " number:");
            tush[i] = sc.nextInt();
        }
        System.out.println("Element in array: " );
        for (int i = 0; i < tush.length; i++){
            System.out.print(tush[i] + " ");
        }

    }
}
