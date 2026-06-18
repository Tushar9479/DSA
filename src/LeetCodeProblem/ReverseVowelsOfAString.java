package LeetCodeProblem;

import static jdk.internal.org.jline.utils.Colors.s;

public class ReverseVowelsOfAString {
    lass Solution {
        public String reverseVowels(String s) {
            int i = 0;
            int j = s.length()-1;
            char[] ch = s.toCharArray();
            while(i<j){
                if(!isVowel(ch[i])){
                    i++;
                }
                else if(!isVowel(ch[j])){
                    j--;
                }
                else{
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
                }
            }
            return String.valueOf(ch);
        }
        public static boolean isVowel(char ch){
            if(ch=='a'|| ch=='i' || ch=='e' || ch=='o' || ch =='u' || ch == 'A' || ch=='I' || ch =='E' || ch =='O' || ch =='U'){
                return true;
            }
            return false;
        }
    }
}
