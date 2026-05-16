package Arrays;

import java.util.Scanner;

public class SecondMaxElement {
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

        int smax = arr[0];
        for (int i = 0; i < n; i++){
            if (arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("first Maximum element : "+max);
        System.out.println("Second Maximum element : "+smax);
    }
}
