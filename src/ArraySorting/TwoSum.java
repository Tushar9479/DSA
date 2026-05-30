package ArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        int [] arr = {0,2,7,5,4,6,3,8};
        Arrays.sort(arr);
        int n = arr.length;
        int sumNo = 9;
        int result = twoSum(arr,sumNo,n);

        if (result == -1) {
            System.out.print("Sum is not found");
        }
    }
    public static int twoSum(int []arr, int sumNo,int n){
        int i = 0;
        int j = n - 1;
        while (i < j){
                if (arr[i] + arr[j] == sumNo){
                    System.out.println("Sum of Number "+ arr[i] + " and " + arr[j]  + " is " + sumNo);
                    return 1;
                }
                else if (arr[i] + arr[j] > sumNo) j--;
                else if (arr[i] + arr[j] < sumNo) i++;

        }
        return -1;
    }
}

