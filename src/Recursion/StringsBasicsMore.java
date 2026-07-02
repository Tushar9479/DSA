package Recursion;

import java.util.ArrayList;

public class StringsBasicsMore {
    static void main(String[] args) {
        String s = "Shivam";
        change(s);
        System.out.println(s);
        String[] arr = {"Raj","Shai","vai","Tush","Vis"};

        ArrayList<String> al = new ArrayList<>();
        al.add("king");
        al.add("Pagal");
        al.add("Bilu");
        al.add("Suar");
        al.add("Ghada");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) { // it is pass by reference
        al.add("Lenda");

    }

    private static void change(String s){ // it is pass by value
        s = "Tushar";
    }
}
