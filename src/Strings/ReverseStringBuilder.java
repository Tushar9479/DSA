package Strings;

public class ReverseStringBuilder {
    static void main(String[] args) {
        String s = "shivam";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        sb.deleteCharAt(1);
//        sb.insert(1,'h');

        sb.delete(4,6);

//        int i = 0, j = sb.length() - 1;
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }
        System.out.println(sb);
    }
}
