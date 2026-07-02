package Recursion;

public class RecursionOnArrays {
    static void main(String[] args) {
        int [] arr = {4,9,0,7,6,3,56,76,78,21,8};
//        recPrint(arr,0);
        int target = 76;
        System.out.println(exists(arr,target,0));
    }
    public static boolean exists(int []arr, int target,int idx){
        if(idx == arr.length) return false;
        if(arr[idx]==target) return true;
        return exists(arr,target,idx+1);
    }



    public static void recPrint(int []arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+ " ");
        recPrint(arr,idx+1);
    }
}
