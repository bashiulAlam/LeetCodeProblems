import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static int maximumUniqueSubarray(int[] nums) {
        int maxSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int start = 0;
        while (start < nums.length) {
            int sum = 0;
            map.clear();
            map.put(nums[start], start);
            int i;
            for (i = start + 1; i < nums.length; i++) {
                if (!map.containsKey(nums[i]))
                    map.put(nums[i], i);
                else break;
            }

            System.out.println("map size : " + map.size() + ", I : " + i);
            for (Map.Entry<Integer, Integer> e : map.entrySet())
                sum += e.getKey();

            if (sum > maxSum)
                maxSum = sum;

            if (i < nums.length)
                start = map.get(nums[i]) + 1;
            else start = i;
            System.out.println("start value changed : " + start);
        }

        return maxSum;
    }

    public static int maximumUniqueSubarray2(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                if (!set.contains(nums[j])) {
                    set.add(nums[j]);
                    sum += nums[j];
                    maxSum = Math.max(maxSum, sum);
                } else break;
            }
        }
        return maxSum;
    }

    public static int maximumUniqueSubarray3(int[] nums) {
        int maxSum = 0;
        int left = 0, right = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                set.add(nums[right]);
                sum += nums[right];
                maxSum = Math.max(maxSum, sum);
                right++;
            } else {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(maximumUniqueSubarray3(new int[] {4,2,4,5,6}));
        System.out.println(maximumUniqueSubarray3(new int[] {5,2,1,2,5,2,1,2,5}));
    }
}
