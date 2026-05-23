package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArray {
    static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        Collections.addAll(list1,2,3,4,5);
        Collections.addAll(list2,9,3,4,5);

       int i = list1.size() - 1;
       int j = list2.size() - 1;

       int carry = 0;

       while (i >= 0 || j >= 0){
            int sum = carry;

            if (i >= 0){
                sum = sum + list1.get(i);
                i--;
            }

            if (j >= 0){
                sum = sum + list2.get(j);
                j--;
            }

            ans.add(sum % 10);

            carry = sum/10;
       }

       if (carry > 0){
           ans.add(carry);
       }

       Collections.reverse(ans);
        System.out.println(ans);
    }
}
