public class Main {

    public static void main(String[] args) {
	// write your code here
        TwoArrays twoArrays = new TwoArrays();
        //twoArrays.mergeTwoArrays(new int[]{1,3,5,7}, new int[]{2,4,6,8});

        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2, 4};
        System.out.println("median : " + twoArrays.findMedianSortedArrays(nums1, nums2));
    }
}
