public class Main {

    public static int triangularSum(int[] nums) {
        //if (nums.length == 1)
          //  return nums[0];
        //else {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - i - 1; j++) {
                    nums[j] = (nums[j] + nums[j + 1]) % 10;
                }
            }

            return nums[0];
        //}
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(triangularSum(new int[] {5})); // 5
        System.out.println(triangularSum(new int[] {1,2,3,4,5})); // 8
        System.out.println(triangularSum(new int[] {3,5})); // 8
        System.out.println(triangularSum(new int[] {1,2,3})); //8
        System.out.println(triangularSum(new int[] {1,2,3,4})); // 0
    }
}
