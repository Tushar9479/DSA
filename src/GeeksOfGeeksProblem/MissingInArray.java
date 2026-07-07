package GeeksOfGeeksProblem;
// Elements from 1 to n

public class MissingInArray {

    class Solution {
        int missingNum(int arr[]) {
            int n = arr.length + 1;
            int i = 0;
            while(i < arr.length){
                if(arr[i] == i + 1 || arr[i] == n) i++;
                else{
                    int idx = arr[i] - 1;
                    swap(i,idx,arr);
                }
            }

            for(i=0;i<arr.length;i++){
                if(arr[i] != i+1) return i+1;
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
