package Arrays;

public class PassingArrayToMethods {
    static void main(String[] args) {
        int [] x = {12,34,65,23};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
    public static void change(int [] x){
        x[2] = 96;
    }
}
