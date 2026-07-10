package OOPS;

public class Constructor {
    public static class Car{
        int price;
        String name;
        Car(){ // Default constructor

        }
        Car(int price,String name){ // Parameterized constructor
           this.price = price;
           this.name = name;
        }
        Car(String s,int x){ // Parameterized constructor
            price = x;
            name = s;
        }

        void print(){
            int price = 12;
            System.out.println(this.price+" "+name);
        }

    }
    static void main(String[] args) {
        Car c1 = new Car(200000,"indica");
        c1.print();
        Car c2 = new Car("fortuner",5000000);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Civic";
    }
}
