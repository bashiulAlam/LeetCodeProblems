import java.util.Arrays;

public class Main {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }

            int nextGreaterElement = -1;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[index]) {
                    nextGreaterElement = nums2[j];
                    break;
                }
            }

            result[i] = nextGreaterElement;
        }

        return result;
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, Integer.MIN_VALUE);

        for (int i = 0; i < nums.length; i++) {
            int index = i + 1;
            int traverseCount = 0;
            while (traverseCount < nums.length && index != i) {
                if (index >= nums.length)
                    index = 0;

                if (nums[index] > nums[i]) {
                    result[i] = nums[index];
                    System.out.println("setting next greater for " + nums[i] + " as " + nums[index]);
                    break;
                } else index++;

                traverseCount++;
            }

            if (result[i] == Integer.MIN_VALUE)
                result[i] = -1;
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        /*printArray(nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2}));
        printArray(nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4}));
        printArray(nextGreaterElement(new int[] {3,1,5,7,9,2,6}, new int[] {1,2,3,5,6,7,9,11}));
        printArray(nextGreaterElement(new int[] {1,3,5,2,4}, new int[] {6,5,4,3,2,1,7}));*/

        //printArray(nextGreaterElements(new int[] {1,2,1}));
        printArray(nextGreaterElements(new int[] {1,2,3,4,3}));
    }
}