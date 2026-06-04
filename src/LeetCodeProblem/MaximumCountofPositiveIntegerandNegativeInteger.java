package LeetCodeProblem;
// only logic
public class MaximumCountofPositiveIntegerandNegativeInteger {
    class Solution {
        public int maximumCount(int[] nums) {
            int low = 0;
            int high = nums.length-1;
            int max = Integer.MIN_VALUE;
            int negpos = binarySearch(nums, low, high,-1);
            int pospos = binarySearch(nums, low, high,0);
            int poscount = nums.length - pospos;
            max = Math.max(poscount, negpos);
            return max;
        }

        public int binarySearch(int[] nums, int low, int high, int x){
            while(low<=high){
                int mid = low + (high - low)/2;
                if(nums[mid]<= x){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            return low;
        }
    }

    //..........................................
//    class Solution {
//        public int maximumCount(int[] nums) {
//
//            int n = nums.length;
//
//            // Count negatives
//            int l = 0, r = n - 1;
//            int firstNonNegative = n;
//
//            while (l <= r) {
//                int mid = l + (r - l) / 2;
//
//                if (nums[mid] >= 0) {
//                    firstNonNegative = mid;
//                    r = mid - 1;
//                } else {
//                    l = mid + 1;
//                }
//            }
//
//            int negCount = firstNonNegative;
//
//            // Count positives
//            l = 0;
//            r = n - 1;
//            int firstPositive = n;
//
//            while (l <= r) {
//                int mid = l + (r - l) / 2;
//
//                if (nums[mid] > 0) {
//                    firstPositive = mid;
//                    r = mid - 1;
//                } else {
//                    l = mid + 1;
//                }
//            }
//
//            int posCount = n - firstPositive;
//
//            return Math.max(negCount, posCount);
//        }
//    }
}
