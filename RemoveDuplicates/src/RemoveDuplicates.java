public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return 1;
        else {
            int check = nums[0], index = 1;
            int swapIndex = 1;
            while (index < nums.length) {
                System.out.println("check val : " + check + " comparing with : " + nums[index]);
                if (nums[index] == check) {
                    index++;
                } else {
                    System.out.println("swapping : " + nums[swapIndex] + " and " + nums[index]);
                    int temp = nums[swapIndex];
                    nums[swapIndex] = nums[index];
                    nums[index] = temp;

                    check = nums[swapIndex];
                    swapIndex++;
                    index++;
                }
            }

            System.out.println("swapIndex : " + swapIndex);
            for (int i = 0; i < nums.length; i++)
                System.out.print(nums[i] + " ");
            System.out.println();

            return swapIndex;
        }
    }
}
