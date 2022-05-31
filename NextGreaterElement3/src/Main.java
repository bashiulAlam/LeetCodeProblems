import java.util.Arrays;

public class Main {
    public static int nextGreaterElement(int n) {
        if (n < 10)
            return -1;
        else if (n < 100) {
            if ((n / 10) < (n % 10))
                return (n % 10) * 10 + (n / 10);
            else return -1;
        } else {
            String s = String.valueOf(n);
            int[] arr = new int[s.length()];
            for (int i = 0; i < s.length(); i++)
                arr[i] = s.charAt(i) - '0';

            int firstDecreasingFromRight = 0;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println("firstDecreasingFromRight " + arr[i - 1] + ", index " + (i - 1));
                    firstDecreasingFromRight = i;
                    break;
                }
            }
            if (firstDecreasingFromRight == 0)
                return -1;
            else {
                int shiftIndex = 0;
                for (int i = arr.length - 1; i > firstDecreasingFromRight - 1; i--) {
                    if (arr[i] > arr[firstDecreasingFromRight - 1]) {
                        System.out.println("shiftIndex " + arr[i] + ", index " + i);
                        shiftIndex = i;
                        break;
                    }
                }
                int temp = arr[firstDecreasingFromRight - 1];
                arr[firstDecreasingFromRight - 1] = arr[shiftIndex];
                arr[shiftIndex] = temp;
                System.out.println("After first swap : " + Arrays.toString(arr));

                int start = firstDecreasingFromRight;
                int end = arr.length - 1;
                while (start < end) {
                    temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;

                    start++;
                    end--;
                }
                System.out.println("After second swap : " + Arrays.toString(arr));

                long result = 0;
                int pow = 1;
                for (int i = arr.length - 1; i >= 0; i--) {
                    //System.out.println(arr[i]);
                    result += (long) arr[i] * pow;
                    pow *= 10;
                }

                if (result > Integer.MAX_VALUE)
                    return -1;
                else return (int) result;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        //System.out.println(nextGreaterElement(12));
        //System.out.println(nextGreaterElement(1243));
        //System.out.println(nextGreaterElement(321));
        //System.out.println(nextGreaterElement(3391));
        //System.out.println(nextGreaterElement(1200000));
        System.out.println(nextGreaterElement(4382931));
        //System.out.println(nextGreaterElement(21));
    }
}
