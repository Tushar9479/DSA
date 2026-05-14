package Arrays;

import java.util.Scanner;

//Multiply odd indexed elements by 2 and add 10 to even indexed elements
public class Question1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Elements of Array :");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before operation :");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++){
            if (i%2 == 0){
                arr[i] += 10;

            }else {
                arr[i] *= 2;
            }
        }
        System.out.println();
        System.out.print("Array after Operation : ");
        for (int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
