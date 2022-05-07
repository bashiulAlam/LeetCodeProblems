import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            //System.out.println("length diff : " + (a.length() - b.length()));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.length() - b.length(); i++)
                sb.append("0");
            sb.append(b);
            b = sb.toString();
        } else if (b.length() > a.length()) {
            //System.out.println("length diff : " + (b.length() - a.length()));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < b.length() - a.length(); i++)
                sb.append("0");
            sb.append(a);
            a = sb.toString();
        }
        //System.out.println("After padding, a: " + a + ", b: " + b);
        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();

        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (strA[i] == '1' && strB[i] == '1') {
                result.append(carry);
                carry = 1;
            } else if (strA[i] == '0' && strB[i] == '0') {
                result.append(carry);
                carry = 0;
            } else {
                if (carry == 1) {
                    result.append("0");
                    carry = 1;
                } else {
                    result.append("1");
                    carry = 0;
                }
            }
        }
        if (carry == 1)
            result.append("1");

        /*int decimalResult = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        String result = Integer.toBinaryString(decimalResult);*/

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1", "11111"));
        System.out.println(addBinary("111", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
