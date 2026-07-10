package OOPS;

public class PolyMorphism {
    public  static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public  static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public  static class Lion{
        void speak(){
            System.out.println("GRRRRRRRR");
        }
    }
    public  static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public  static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Cat c = new Cat();

        d.speak();
        c.speak();
        h.speak();
        p.speak();
    }
}
