package MultiDimensionalArrays;

public class RowWithMaximumSum {
    static void main(String[] args) {
        int [][] arr = {{3,4,5,6},{1,4,6,8},{5,7,3,7}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for (int j =0;j<arr[0].length;j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(row + " " + maxSum);

    }
}
