package ArraySorting;

public class PushZerosToEnd {
    static void main(String[] args) {
        int [] arr = {2,0,3,4,0,-2,0,9,7};
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] != 0){
                if (i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
