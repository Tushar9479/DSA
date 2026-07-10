package OOPS;
class Cricketer{
//    final String country = "India";
    static String country = "NZ";
    int runs;
    String name;
    double avg;
    void print(){
        System.out.println(runs+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("I only believe in Jassi Bhai");
    }
}
public class FinalAndStatic {
    static void main(String[] args) {
        Cricketer.greet();
        System.out.println(Cricketer.country);

        Cricketer c1 = new Cricketer();
//        c1.country = "England"; // Cannot assign a value to final variable 'country
//        System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c2.country);
        c2.greet();
//        fun();
    }

//    private void fun(){
//        System.out.println("Shivam");
//    }
}
//Non-static method 'fun()' cannot be referenced from a static context
// static means sharable variables