package OOPS;
class Pokemon{
    private int power;
    String type;
    Pokemon(String type, int power){ // if any variable is private so it can be accessible for other class by ceating a function. In this the constructor act as a "setter"
        this.power = power;
        this.type = type;
    }
    Pokemon( int power,String type){
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }
    int getPower(){ // getter
        return power;
    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
public class RevisionOOPS {
    static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type = "Fire";
//        pikachu.power = 34; not working . If remove private from power it is accessible
        Pokemon jigglypuff = new Pokemon(50,"Fairy");
        System.out.println(pikachu.getPower()); // For this getter is created
        pikachu.print(); jigglypuff.print();
        Pokemon gengar = new Pokemon();

        final int x = 89; // x cant be changed



    }
}
