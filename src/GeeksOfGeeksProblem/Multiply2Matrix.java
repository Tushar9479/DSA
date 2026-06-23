package GeeksOfGeeksProblem;

import java.util.ArrayList;

public class Multiply2Matrix {
    class Solution {
        public ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {
            int n = a.length;
            int [][] c = new int[n][n];
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for (int k=0;k<n;k++){
                        c[i][j] += (a[i][k]*b[k][j]);
                    }
                }
            }
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            for (int i=0;i<n;i++){
                ans.add(new ArrayList<>());
                for(int j=0;j<n;j++){
                    ans.get(i).add(c[i][j]);
                }
            }
            return ans;
        }
    }

    //*************************************

    public ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += (a[i][k] * b[k][j]);
                }
                ans.get(i).add(sum);
            }
        }
        return ans;
    }

}
