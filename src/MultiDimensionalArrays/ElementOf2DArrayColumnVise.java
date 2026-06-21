package MultiDimensionalArrays;

public class ElementOf2DArrayColumnVise {
    static void main(String[] args) {
        int [][] arr = {{3,4,5,6},{1,4,6,8},{5,7,3,7}};
        for (int j = 0;j < arr[0].length;j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
// ********************ERROR*******************
//        for(int i =0;i<arr.length;i++){
//            for (int j =0;j<arr[0].length;j++){
//                System.out.print(arr[j][i]+"  ");
//            }
//            System.out.println();
//        }
    }
}
