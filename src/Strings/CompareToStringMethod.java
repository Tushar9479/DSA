package Strings;

public class CompareToStringMethod {
    public static void main(String[] args) {
        String a = "tushar";
        String b = "shivam";

        int result = compareStrings(a, b);
        System.out.println(result);
    }

    public static int compareStrings(String a, String b) {
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }
}