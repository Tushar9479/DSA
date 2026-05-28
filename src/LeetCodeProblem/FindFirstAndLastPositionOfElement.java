package LeetCodeProblem;
//only logic
public class FindFirstAndLastPositionOfElement {
    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int left = findLeft(nums,target);
            int right = findright(nums,target);

            return new int [] {left,right};
        }

        public int findLeft(int []nums,int target){
            int l = 0;
            int r = nums.length - 1;
            int left = -1;
            while(l <= r){
                int mid = (r + l)/2;
                if(nums[mid] == target){
                    left = mid;
                    r = mid - 1;
                }else if(nums[mid] < target){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }
            return left;
        }
        public int findright(int []nums,int target){
            int l = 0;
            int r = nums.length - 1;
            int right = -1;
            while(l <= r){
                int mid = (r + l)/2;
                if(nums[mid] == target){
                    right = mid;
                    l = mid + 1;
                }else if(nums[mid] < target){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
            return right;
        }
    }
}
