package LeetCodeProblem;
// only logic

public class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int ptr1 = 0, ptr2 = height.length-1;
            int maxwater = 0;
            while(ptr1<ptr2){
                if(height[ptr1]<=height[ptr2]){
                    maxwater = Math.max(maxwater,(height[ptr1] * (ptr2-ptr1)));
                    ptr1++;
                }
                else{
                    maxwater = Math.max(maxwater,(height[ptr2]* (ptr2-ptr1)));
                    ptr2--;
                }
            }
            return maxwater;
        }
    }
}
