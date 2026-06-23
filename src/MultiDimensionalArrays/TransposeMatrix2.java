package MultiDimensionalArrays;
// For rectangle and square
public class TransposeMatrix2 {
        static void main(String[] args) {
            int[][] arr = {{2,4,6,4},{5,8,6,9},{5,5,6,4},{3,1,8,5}};
            print(arr);
            int row = arr.length, col = arr[0].length;
            int [][] b = new int [col][row];
            for(int i = 0; i < b.length; i++){
                for(int j = 0;j<b[0].length;j++){
                    b[i][j] = arr[j][i];
                }
            }
            print(b);
        }


        private static void print(int[][] arr){
            for(int [] a : arr){
                for (int ele : a){
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}

