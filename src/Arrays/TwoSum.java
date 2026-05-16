package Arrays;

import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter Array Elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number for finding equal sum:");
        int sumNo = sc.nextInt();

        int result = twoSum(arr,sumNo,n);

        if (result == -1) {
            System.out.print("Sum is not found");
        }


    }
    public static int twoSum(int []arr, int sumNo, int n){
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] + arr[j] == sumNo){
                    System.out.println("Sum of Number "+ arr[i] + " and " + arr[j]  + " is " + sumNo);
                    return sumNo;
                }

            }
        }
        return -1;
    }
}
