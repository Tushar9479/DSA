package Strings;

public class PassingStringToMethod {
    public static void change(String x){
        x = "Tushar";
    }// no change in x because it is completely different box are create
    static void main(String[] args) {
        String x = "Shivam";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
