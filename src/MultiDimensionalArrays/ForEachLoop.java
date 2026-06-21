package MultiDimensionalArrays;

public class ForEachLoop {
    static void main(String[] args) {
        int [][] arr = {{3,4,5,6},{1,4,6,8},{5,7,3,7}};
        for (int [] a : arr){
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int ele : arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
