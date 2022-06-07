import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int start = j + 1;
                int end = nums.length - 1;

                while (start < end) {
                    if (nums[i] + nums[j] + nums[start] + nums[end] == target) {
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[start]);
                        tempList.add(nums[end]);

                        if (!result.contains(tempList))
                            result.add(tempList);

                        start++;
                        end--;
                    } else if (nums[i] + nums[j] + nums[start] + nums[end] < target) start++;
                    else end--;
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                if (nums[i] + nums[start] + nums[end] == 0) {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(nums[start]);
                    tempList.add(nums[end]);

                    if (!result.contains(tempList))
                        result.add(tempList);

                    start++;
                    end--;
                } else if (nums[i] + nums[start] + nums[end] < 0) start++;
                else end--;
            }
        }

        return result;
    }

    public static void print(List<List<Integer>> list) {
        System.out.println("list size : " + list.size());
        for (List<Integer> item : list)
            System.out.println(item);
        //System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        //print(fourSum(new int[] {1,0,-1,0,-2,2}, 0));
        //print(fourSum(new int[] {2,2,2,2,2}, 8));

        //print(threeSum(new int[] {-1,0,1,2,-1,-4}));
//        print(threeSum(new int[] {}));
        print(threeSum(new int[] {0}));
    }
}
