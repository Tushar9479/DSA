package ArraySorting;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {

        public static ArrayList<Integer> commonElements(int a[], int b[]) {

            int i = 0, j = 0;
            Arrays.sort(a);
            Arrays.sort(b);
            ArrayList<Integer> ans = new ArrayList<>();

            while (i < a.length && j < b.length) {
                if (a[i] == b[j]) {
                    ans.add(a[i]);
                    i++;
                    j++;
                }
                else if (a[i] < b[j]) {
                    i++;
                }
                else {
                    j++;
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5, 6};
            int[] b = {2, 4, 6, 8, 10};
            ArrayList<Integer> result = commonElements(a, b);
            System.out.println(result);
        }
}

