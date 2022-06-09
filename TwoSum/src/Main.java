public class Main {

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2)
            return new int[] {1, 2};
        else {
            int start = 0;
            int end = numbers.length - 1;
            int[] result = new int[2];

            while (start < end) {
                if (numbers[start] + numbers[end] == target) {
                    result[0] = start + 1;
                    result[1] = end + 1;
                    break;
                } else if (numbers[start] + numbers[end] > target)
                    end--;
                else start++;

                //System.out.println("start : " + start + ", end : " + end);
            }

            return result;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        print(twoSum(new int[] {2,7,11,15}, 9));
        print(twoSum(new int[] {2,3,4}, 6));
        print(twoSum(new int[] {-1,0}, -1));
    }
}
