package Strings;

public class Plus {
    static void main(String[] args) {
        String s = "tushar";
        s = s + "is king of the world";
        s += 10;
        s += "\n";
        s += 'a';
        // In this type of addition any time new string is created so it increase the time complexity and size also
        System.out.println(s);
        System.out.println("shivam"+9+20); // string + integer = string
        System.out.println("shivam"+(9+20)); // string + integer = string
        System.out.println(10+"shivam"+20); // string + integer = string
        System.out.println(10+20+"shivam"); // string + integer = string
        System.out.println('A'+"shivam"); // string + integer = string
        System.out.println('A'+2+"shivam"); // string + integer = string

    }
}
