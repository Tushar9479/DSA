package OOPS;

import java.util.Scanner;

public class UserDefinedDataTypes {
    public static class Student{
        String name;
        int rno;
        double cgpa;

        void print(){
            System.out.println(name+" "+rno+" "+" "+cgpa);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.rno = 1131;
        s1.cgpa = 7.5;

        Student s2 = new Student();
        s2.name = "Tushar";
        s2.rno = sc.nextInt();
        s2.cgpa = 7.9;

//        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
        s2.cgpa = 9;
//        System.out.println(s2.cgpa);
//        System.out.println(s2.rno);

        s1.print();
        s2.print();
    }
}
