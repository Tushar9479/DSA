package Strings;

public class InterningNew {
    static void main(String[] args) {
        String s1 = new String("tushar");
        String s2 = new String("tushar");
        System.out.println(s1 == s2); // false because the location of both are different two different boxes are create
        System.out.println(s1.equals(s2));


        String s3 = "shivam";
        String s4 = "shivam";
        System.out.println(s3 == s4); // true because both points to shivam
    }
}
