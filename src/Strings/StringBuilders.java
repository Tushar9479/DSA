package Strings;

public class StringBuilders {
    static void main(String[] args) {
        // in this type of addition no other string is formed it gives the capacity to the first string
//        StringBuilder s= new StringBuilder("Shivam");
//        System.out.println(s.length()+ " " + s.capacity());
//        System.out.println(s);
//        s.append("yadav");
//        System.out.println(s);


//        StringBuilder s1 = new StringBuilder(10);
//        s1.append("yadav");
//        System.out.println(s1);

        StringBuilder s2 = new StringBuilder();
        System.out.println(s2.length()+" "+s2.capacity());
        s2.append("Tushar");
        System.out.println(s2.length()+" "+s2.capacity());
        System.out.println(s2);
        s2.setCharAt(1,'a');
        System.out.println(s2);
        String t = s2.toString();
        System.out.println(t);

    }
}
