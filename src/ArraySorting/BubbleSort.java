package ArraySorting;

public class BubbleSort {
    public static void print(int [] arr) {
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {5,-1,-2,4,1,7};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }


//        Bubble Sort
//        for (int j = 0; j < n-1; j++){
//            for (int i = 0; i < n - 1 - j; i++){
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        print(arr);

        //Bubble Sort Optimized
//        for (int j = 0; j < n-1; j++){
//            int swap = 0;
//            for (int i = 0; i < n - 1 - j; i++){
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    swap++;
//                }
//            }
//            if (swap == 0) break;
//        }
        print(arr);


    }
}
