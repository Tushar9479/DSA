package Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    static void main(String[] args) {
        int [] arr = {12,34,5,2,4,-69};
        print(arr);
        Arrays.sort(arr);
        print(arr);


    }
    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
