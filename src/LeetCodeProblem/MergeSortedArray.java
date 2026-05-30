package LeetCodeProblem;
// Only logic
public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = 0;
            int j = 0;
            int k = 0;
            int[] c = new int[nums1.length + nums2.length];
            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    c[k] = nums1[i];
                    k++;
                    i++;
                }
                else{
                    c[k] = nums2[j];
                    k++;
                    j++;
                }
            }
            while(m> i){
                c[k] = nums1[i];
                k++;
                i++;
            }
            while(n > j){
                c[k] = nums2[j];
                k++;
                j++;
            }
            for(int p = 0; p < m + n; p++){
                nums1[p] = c[p];
            }
        }
    }

}
