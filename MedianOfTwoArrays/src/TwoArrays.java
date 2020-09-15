/**
 * Created by Sabab on 9/15/2020.
 */
public class TwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeTwoArrays(nums1, nums2);
        double median;

        if (mergedArray.length % 2 != 0)
            median = (double) mergedArray[mergedArray.length / 2];
        else
            median = ((double) mergedArray[mergedArray.length / 2] + (double) mergedArray[(mergedArray.length / 2) - 1]) / 2;

        return Double.parseDouble(String.format("%.5f", median));
    }

    public int[] mergeTwoArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0, j = 0, index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[index] = nums1[i];
                i++;
            } else {
                mergedArray[index] = nums2[j];
                j++;
            }

            index++;
        }

        while (i < nums1.length) {
            mergedArray[index] = nums1[i];
            i++;
            index++;
        }

        while (j < nums2.length) {
            mergedArray[index] = nums2[j];
            j++;
            index++;
        }

        /*for (int k = 0; k < mergedArray.length; k++)
            System.out.print(mergedArray[k] + " ");
        System.out.println();*/

        return mergedArray;
    }
}
