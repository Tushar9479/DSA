package LeetCodeProblem;
// only logic
public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;
            for(int i = digits.length-1; i>=0; i--){
                if(digits[i] + carry > 9){
                    digits[i] = 0;
                    carry = 1;
                }
                else{
                    digits[i] = carry+digits[i];
                    carry = 0;
                }
            }
            if(carry == 1){
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                return arr;
            }

            return digits;
        }
    }
}
