import java.util.Arrays;

public class Main {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++)
                nums1[i] = nums2[i];
        } else if (n >= 1) {
            int num2Index = 0;
            for (int i = m; i < (m + n); i++) {
                nums1[i] = nums2[num2Index];
                num2Index++;
            }

            Arrays.sort(nums1);
        }

        for (int i = 0; i < (m + n); i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        merge(new int[] {1}, 1, new int[] {}, 0);
        merge(new int[] {0}, 0, new int[] {1}, 1);
        merge(new int[] {1,0}, 1, new int[] {2}, 1);
        merge(new int[] {0,0,0,0,0}, 0, new int[] {1,2,3,4,5}, 5);
        merge(new int[] {-1,0,0,3,3,3,0,0,0}, 6, new int[] {1,2,2}, 3);
    }
}
