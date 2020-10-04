public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        else {
            int start = 0, end = nums.length;

            while (start != end) {
                if (nums[start] != val)
                    start++;
                else {
                    if (nums[end - 1] != val) {
                        nums[start] = nums[end - 1];
                        nums[end - 1] = val;
                        start++;
                        end--;
                    } else end--;
                }
            }

            return end;
        }
    }
}
