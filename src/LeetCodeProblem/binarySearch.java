package LeetCodeProblem;
// Only logic
public class binarySearch {
    class Solution {
        public boolean binarySearch(int[] arr, int k) {
            // code here
            int n = arr.length;
            int lo = 0, hi = n - 1;
            int mid = 0;
            while(lo <= hi){
                mid = (lo + hi)/2;

                if(arr[mid] == k) return true;
                else if(arr[mid] < k) lo = mid + 1 ;
                else hi = mid -1;
            }
            return false;

        }
    }
}
