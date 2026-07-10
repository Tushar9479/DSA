package OOPS;

public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+name+" "+length+" ");
        }
    }
    static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Indica V2";
        c.seats = 5;
        c.torque = 178;
        c.type = "HedgeBack";

        change(c);

        System.out.println(c.seats);

        c.print();
    }
    // Java mein object pass karne par object nahi,
    // uske reference ki copy (pass by value) pass hoti hai.
    // Isliye object ki fields change ho sakti hain,
    // lekin original reference ko replace nahi kiya ja sakta.
    private static void change(Car x){
        x.seats = 4;
    }
}
