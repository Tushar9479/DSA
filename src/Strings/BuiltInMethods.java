package Strings;

public class BuiltInMethods {
    static void main(String[] args) {
        String s = "Shivam Yadav";
        System.out.println(s.indexOf('a'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String t = "harshita";
        System.out.println(t.contains("harsh"));

        if(t.contains("arsh"))
            System.out.println("happy");

        System.out.println(t.startsWith("ha"));
    }
}
