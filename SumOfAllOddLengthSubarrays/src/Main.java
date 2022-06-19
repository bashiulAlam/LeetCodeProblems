public class Main {

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int iteration = 1;
        while (iteration <= arr.length) {
            //System.out.println("sub array size : " + iteration);
            for (int i = 0; i <= arr.length - iteration; i++) {
                //System.out.println("array start : " + arr[i] + ", end : " + arr[arr.length - iteration]);
                for (int j = i; j < i + iteration; j++) {
                    //System.out.println("array element : " + arr[j]);
                    sum += arr[j];
                }
                //System.out.println("sum after sub array : " + sum);
            }
            iteration += 2;
        }

        return sum;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
        System.out.println(sumOddLengthSubarrays(new int[] {1,2}));
        System.out.println(sumOddLengthSubarrays(new int[] {10,11,12}));
    }
}
