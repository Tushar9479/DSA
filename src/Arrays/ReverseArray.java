package Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int [] arr = {3,4,5,7,8,3,1};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        System.out.print("Before Reverse :");
        for ( int ele: arr){
            System.out.print(ele + " ");
        }
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.print("After Reverse :");
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
