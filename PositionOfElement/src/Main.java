public class Main {

    public static void main(String[] args) {
	// write your code here
        SearchRange searchRange = new SearchRange();
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 10;
        int[] range = searchRange.searchRange(nums, target);

        System.out.println(range[0] + " " + range[1]);
    }
}
