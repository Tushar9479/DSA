package Arrays;

import java.util.Scanner;

public class RotateArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter Array Elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d:");
        int d = sc.nextInt();
        int i = 0;
        int j = d - 1;

        System.out.print("Before Reverse :");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        // Reverse array upto d - 1
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Reverse array from d to n -1
        int a = d;
        int b = n - 1;
        while (a < b) {
            int tempe = arr[a];
            arr[a] = arr[b];
            arr[b] = tempe;
            a++;
            b--;
        }
        //Reverse whole array
        int k = 0;
        int m = n - 1;
        while (k < m) {
            int tempe = arr[k];
            arr[k] = arr[m];
            arr[m] = tempe;
            k++;
            m--;
        }
        System.out.println();
        System.out.print("After Reverse :");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}

