package OOPS;
class Students{
    String name; // null
    private int rno; // 0
    double cgpa;// 0.0

    void print(){
        System.out.println(name+" "+cgpa+" "+rno);
    }

    int getRno(){ // getter
        return rno;
    }
    void setRno(int x){ // setter
        rno = x;
    }


//    private void print(){
//        System.out.println(name+" "+cgpa+" "+rno);
//    }
//    public void p(){
//        print();
//
//    }
}
public class PrivateKeyword{
    static void main(String[] args) {
        Students s1 = new Students();
//        System.out.println(s1.rno);
//        s1.p();
        s1.print();
        s1.cgpa = 8.9;
        s1.name = "Tushar";
        System.out.println(s1.getRno());
        s1.setRno(45);
//        s1.rno= 34; error
//        s1.p();
//        Students s2 = new Students();
//        s2.p();
    }
}
