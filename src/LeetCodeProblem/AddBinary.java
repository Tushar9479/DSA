package LeetCodeProblem;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = ch1.length - 1;
            int j = ch2.length - 1;
            int carry = 0;

            while (i >= 0 || j >= 0) {

                char bit1 = (i >= 0) ? ch1[i] : '0';
                char bit2 = (j >= 0) ? ch2[j] : '0';

                if (bit1 == '1' && bit2 == '1') {
                    if (carry == 1) {
                        sb.append('1');
                    } else {
                        sb.append('0');
                    }
                    carry = 1;
                }
                else if ((bit1 == '1' && bit2 == '0') ||
                        (bit1 == '0' && bit2 == '1')) {

                    if (carry == 1) {
                        sb.append('0');
                        carry = 1;
                    } else {
                        sb.append('1');
                        carry = 0;
                    }
                }
                else {
                    if (carry == 1) {
                        sb.append('1');
                        carry = 0;
                    } else {
                        sb.append('0');
                    }
                }
                i--;
                j--;
            }
            if (carry == 1) {
                sb.append('1');
            }
            return sb.reverse().toString();
        }
    }

//    class Solution {
//        public String addBinary(String a, String b) {
//            char[] charArrA = a.toCharArray();
//            char[] charArrB = b.toCharArray();
//            StringBuilder sb = new StringBuilder();
//
//            int i = charArrA.length - 1, j = charArrB.length - 1;
//            int carry = 0;
//            while (i >= 0 || j >= 0 || carry > 0) {
//                int aNum = i >= 0 ? charArrA[i] - '0' : 0;
//                int bNum = j >= 0 ? charArrB[j] - '0' : 0;
//
//                int sum = aNum + bNum + carry;
//                int digit = sum % 2;
//                carry = sum / 2;
//                i--;
//                j--;
//
//                sb.append((char)(digit + '0'));
//            }
//
//            return sb.reverse().toString();
//        }
//    }
}
