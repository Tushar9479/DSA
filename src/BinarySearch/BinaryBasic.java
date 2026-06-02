package BinarySearch;
// only logic
public class BinaryBasic {
    static void main(String[] args) {
        int [] arr = {2,5,6,8,12,17};
        int k = 6;
        int result = binarySearch(arr, k);
        System.out.println(result);
    }
        public static int binarySearch(int[] arr, int k) {
            // code here
            int n = arr.length;
            int lo = 0, hi = n - 1;
            int mid = 0;
            while(lo <= hi){
                mid = (lo + hi)/2;

                if(arr[mid] == k) return mid;
                else if(arr[mid] < k) lo = mid + 1 ;
                else hi = mid -1;
            }
            return -1;


    }
}
