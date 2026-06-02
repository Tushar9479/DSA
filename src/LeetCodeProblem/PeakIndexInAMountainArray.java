package LeetCodeProblem;
// Only logic
public class PeakIndexInAMountainArray {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length - 2, lo = 1, hi = n - 1;
            while(lo <= hi){
                int mid = (lo+hi)/2;
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
                else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
                    lo = mid + 1;
                }else hi = mid - 1;
            }
            return lo;
        }
    }

    // OR

//    class Solution {
//        public int peakIndexInMountainArray(int[] arr) {
//            int n = arr.length - 2, lo = 1, hi = n - 1;
//            while(lo <= hi){
//                int mid = (lo+hi)/2;
//                if(arr[mid] > arr[mid + 1]) hi = mid - 1;
//                else lo = mid + 1;
//            }
//            return lo;
//        }
//    }

}
