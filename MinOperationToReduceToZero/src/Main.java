import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int minOperations(int[] nums, int x) {
        if (nums[0] > x && nums[nums.length - 1] > x)
            return -1;
        else {
            int total = 0;
            for (int i : nums)
                total += i;

            if (total - x == 0)
                return nums.length;
            else {
                total -= x;
                int sum = 0;
                int i = 0, j = 0;
                int max = -1;
                while (i < nums.length) {
                    if (j < nums.length && sum < total) {
                        sum += nums[j];
                        j++;
                    } else {
                        sum -= nums[i];
                        i++;
                    }

                    if (sum == total)
                        max = Math.max(max, j - i);
                }

                if (max > -1)
                    return nums.length - max;
                else return max;
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(minOperations(new int[]{1, 1, 4, 2, 3}, 5));
        System.out.println(minOperations(new int[]{5, 6, 7, 8, 9}, 4));
        System.out.println(minOperations(new int[]{3, 2, 20, 1, 1, 3}, 10));
    }
}
