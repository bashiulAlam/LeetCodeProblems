import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder numStr = new StringBuilder();
        StringBuilder kStr = new StringBuilder();
        int numSize = num.length;
        int kSize = String.valueOf(k).length();

        if (numSize > kSize) {
            for (int i = 0; i < numSize - kSize; i++)
                kStr.append('0');
        } else if (kSize > numSize) {
            for (int i = 0; i < kSize - numSize; i++)
                numStr.append('0');
        }
        for (int i = 0; i < num.length; i++)
            numStr.append(num[i]);
        kStr.append(k);
        System.out.println("numStr after append : " + numStr + " || kStr after append : " + kStr);

        char[] c = numStr.toString().toCharArray();
        char[] kArr = kStr.toString().toCharArray();

        List<Integer> numList = new ArrayList<Integer>();
        int carry = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            int sum = (c[i] - '0') + (kArr[i] - '0') + carry;
            if (sum < 10) {
                numList.add(sum);
                carry = 0;
            } else {
                numList.add(sum % 10);
                carry = 1;
            }
        }
        if (carry == 1)
            numList.add(1);

        Collections.reverse(numList);
        return numList;
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        printList(addToArrayForm(new int[] {1,2,0,0}, 34));
        printList(addToArrayForm(new int[] {2,7,4}, 181));
        printList(addToArrayForm(new int[] {2,1,5}, 806));
        printList(addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9}, 1));
    }
}
