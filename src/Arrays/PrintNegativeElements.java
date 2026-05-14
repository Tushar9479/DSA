package Arrays;

import java.util.Scanner;

public class PrintNegativeElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.print("Enter The Elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Negative values are :");
        for (int i = 0; i < n; i++){
            if (arr[i] < 0){
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
