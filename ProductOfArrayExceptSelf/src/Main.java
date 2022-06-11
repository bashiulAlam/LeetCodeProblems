public class Main {

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int multi = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i)
                    multi *= nums[j];
            }

            answer[i] = multi;
        }

        return answer;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[right.length - 1] = 1;

        for (int i = 1; i < left.length; i++)
            left[i] = left[i - 1] * nums[i - 1];
        for (int i = right.length - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];

        for (int i = 0; i < nums.length; i++)
            nums[i] = left[i] * right[i];

        return nums;
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        print(productExceptSelf2(new int[] {1,2,3,4}));
        print(productExceptSelf2(new int[] {-1,1,0,-3,3}));
    }
}
