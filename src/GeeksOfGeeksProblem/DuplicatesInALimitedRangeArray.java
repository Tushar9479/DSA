package GeeksOfGeeksProblem;

import java.util.ArrayList;

public class DuplicatesInALimitedRangeArray {
    class Solution {
        public ArrayList<Integer> findDuplicates(int[] arr) {
            ArrayList<Integer> ans = new ArrayList<>();
            int n = arr.length;
            int i = 0;
            while(i < n){
                int rigthIdx = arr[i]-1;
                if(arr[i] == i+1 || arr[rigthIdx] == arr[i]) i++;
                else swap(arr,i,rigthIdx);
            }

            for(i=0;i<n;i++){
                if(arr[i] != i+1) ans.add(arr[i]);
            }
            return ans;
        }
        private void swap(int[] arr, int i, int  j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
