import java.util.ArrayList;

public class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int carry = 0;
        if (digits[digits.length - 1] == 9) {
            result.add(0);
            carry = 1;
        } else result.add(digits[digits.length - 1] + 1);
        for (int i = digits.length - 2; i >= 0; i--) {
            if (carry == 1) {
                if (digits[i] + carry <= 9) {
                    result.add(digits[i] + carry);
                    carry = 0;
                } else {
                    result.add(0);
                    carry = 1;
                }
            } else result.add(digits[i]);
        }
        if (carry == 1)
            result.add(1);

        int[] plusOne = new int[result.size()];
        int index = 0;
        for (int i = result.size() - 1; i >= 0; i--) {
            plusOne[index] = result.get(i);
            index++;
        }
        return plusOne;
    }
}
