public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        int[] arr = solution.plusOne(new int[] {9, 9, 9, 3, 9, 9});

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }
}
