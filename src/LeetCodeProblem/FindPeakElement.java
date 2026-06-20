package LeetCodeProblem;
// only logic
public class FindPeakElement {
    class Solution {
        public int findPeakElement(int[] nums) {
            if (nums.length==2 && nums[0]<nums[1]){
                return 1;
            }
            for (int i=1;i<nums.length-1;i++){
                if (nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    return i;
                } else if (nums[nums.length-1]>nums[nums.length-2]){
                    return nums.length-1 ;
                }
            }
            return 0;
        }
    }

//    int start = 0;
//    int end = nums.length - 1;
//
//        while (start < end) {
//        int mid = start + (end - start) / 2;
//
//        if (nums[mid] > nums[mid + 1]) {
//            end = mid;
//        } else {
//            start = mid + 1;
//        }
//    }
//
//        return start;
}
