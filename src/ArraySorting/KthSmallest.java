package ArraySorting;

public class KthSmallest {
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
            int k = 3;
            for (int i = 0; i < k; i++){
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
            System.out.println(arr[k-1]);
        }
}
