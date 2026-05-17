package Arrays;

public class WaveArray {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int i = 0;
        while (i < arr.length - 1){

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
                i = i + 2;

        }
        for (int k = 0; k < n; k++){
            System.out.print(arr[k]);
        }
    }
}
