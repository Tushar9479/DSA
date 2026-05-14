package Arrays;

import java.util.Scanner;

public class MaximumElementInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++){
            if (arr[i] >  max){
                max = arr[i];
            }

        }
        System.out.println("Maximum element is: " + max);

    }
}
