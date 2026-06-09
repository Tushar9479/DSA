package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "aba";

        int i = 0, j = s.length() - 1;
        boolean palindrome = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}