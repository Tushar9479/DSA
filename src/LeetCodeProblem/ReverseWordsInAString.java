package LeetCodeProblem;

public class ReverseWordsInAString {
    class Solution {
        public String reverseWords(String s) {
            String[] s1 = s.split(" +");
            StringBuilder sb = new StringBuilder();
            for(int i = s1.length - 1;i>=0;i--){
                sb.append(s1[i]);
                sb.append(" ");
            }
            return sb.toString().trim();
        }
    }
}
