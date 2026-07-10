package OOPS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;
        StudentData(int[] s){
//            marks =  new int[s];
            marks = Arrays.copyOf(s,s.length);
        }
        StudentData(int s){
            marks =  new int[s];
        }

    }
    static void main(String[] args) {
        int[] arr = {2,3,6,4,9,8};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(2);

//        s1.marks[0] = 89;
//        s1.marks[1] = 65;
//        s1.marks[2] = 98;
//        s1.marks[3] = 67;
    }
}
