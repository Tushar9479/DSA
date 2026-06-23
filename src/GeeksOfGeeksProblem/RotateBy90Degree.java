package GeeksOfGeeksProblem;
// This is Anti Clock vise
public class RotateBy90Degree {
    class Solution {
        public void rotateMatrix(int[][] arr) {

            //Transpose Matrix
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            //Reverse Each Column
            for (int j = 0; j < arr[0].length; j++) {

                int top = 0;
                int bottom = arr.length - 1;

                while (top < bottom) {

                    int temp = arr[top][j];
                    arr[top][j] = arr[bottom][j];
                    arr[bottom][j] = temp;

                    top++;
                    bottom--;
                }
            }
        }
    }
}
