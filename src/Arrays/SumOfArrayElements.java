package Arrays;

import java.util.Scanner;

public class SumOfArrayElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Enter array Elements:");
        for (int i = 0;i < n; i++){
            x[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += x[i];
        }
        System.out.println("Sum of elements is : " + sum);

    }
}
