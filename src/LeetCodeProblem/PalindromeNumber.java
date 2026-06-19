package LeetCodeProblem;

public class PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            String str = Integer.toString(x);
            int i = 0;
            int j = str.length() - 1;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)) return false;
                else{
                    i++;
                    j--;
                }
            }
            return true;
        }
    }

//    class Solution {
//        public boolean isPalindrome(int x) {
//            if(x<0) return false;
//            int original = x;
//            int reverse = 0;
//            while(x!=0){
//                int digit = x%10;
//                reverse = reverse * 10 + digit;
//                x = x/10;
//            }
//            return original == reverse;
//        }
//    }
}
