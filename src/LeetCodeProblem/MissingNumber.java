package LeetCodeProblem;
// Elements from 0 to n
public class MissingNumber {
    class Solution {
        public int missingNumber(int[] arr) {
            int n = arr.length;
            int i = 0;
            while(i < arr.length){
                if(arr[i] == i || arr[i] == n) i++;
                else{
                    int idx = arr[i];
                    swap(i,idx,arr);
                }
            }

            for(i=0;i<arr.length;i++){
                if(arr[i] != i) return i;
            }
            return n;
        }

        private void swap(int i, int idx, int[] arr){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
