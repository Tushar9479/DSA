package Strings;

public class PrintAllSubString {
    static void main(String[] args) {
        String s = "tushar";
        int n = s.length();

        for (int i = 0; i < n ;i++){
            for (int j = i; j < n ;j++){
                System.out.print(s.substring(i,j + 1) + " ");
            }
            System.out.println();
        }
    }
}
