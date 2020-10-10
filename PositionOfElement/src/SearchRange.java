public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = firstOccurrence(nums, 0, nums.length - 1, target);
        range[1] = secondOccurrence(nums, 0, nums.length - 1, target, nums.length);

        return range;
    }

    static int firstOccurrence(int[] nums, int start, int end, int target) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target))
                return mid;
            else if (target > nums[mid])
                return firstOccurrence(nums, mid + 1, end, target);
            else return firstOccurrence(nums, start, mid - 1, target);
        } else return -1;
    }

    static int secondOccurrence(int[] nums, int start, int end, int target, int length) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (nums[mid] == target && (mid ==  length - 1 || nums[mid + 1] > target))
                return mid;
            else if (target < nums[mid])
                return secondOccurrence(nums, start, mid - 1, target, length);
            else return secondOccurrence(nums, mid + 1, end, target, length);
        } else return -1;
    }
}
