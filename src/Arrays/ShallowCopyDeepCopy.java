package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main(String[] args) {
        int a = 4;// 4 byte
        int []arr = {12,3,45,69};//16 bytes
//        int [] x = arr;// x is shallow of arr
//        x[0] = 45;
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}
