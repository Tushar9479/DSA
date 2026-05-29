package LeetCodeProblem;

public class RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {

            k = k % nums.length;
            int x = 0;
            int y = nums.length - 1;

            while(x < y){
                int temp = nums[x];
                nums[x] = nums[y];
                nums[y] = temp;
                x++;
                y--;
            }

            int i = 0;
            int j = k - 1;

            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }

            int a = k;
            int b = nums.length - 1;

            while(a < b){
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b--;
            }


        }
    }
}
