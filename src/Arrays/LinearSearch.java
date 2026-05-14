package Arrays;

import javax.swing.text.html.parser.Entity;
import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.print("Enter Elements of array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target :");
        int target = sc.nextInt();
        int result = search(arr,target,n);

       if (result > -1){
           System.out.println("Element found at index :" + result);
       }else {
           System.out.println("Element not found");
       }

    }

    public static int search(int[] x, int traget, int size) {
        for (int i = 0; i < size; i++){
            if (x[i] == traget){
                return i;
            }
        }
       return -1;
    }

}
