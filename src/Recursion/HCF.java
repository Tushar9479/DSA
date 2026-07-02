package Recursion;

public class HCF {
    static void main(String[] args) {
        int a = 4, b = 8;
        int hcf = 1;
        for(int i=2;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
