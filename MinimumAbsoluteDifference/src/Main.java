import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minimumDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < minimumDiff)
                minimumDiff = Math.abs(arr[i] - arr[i - 1]);
        }
        //System.out.println("minimumDiff : " + minimumDiff);
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == minimumDiff) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i - 1]);
                tempList.add(arr[i]);
                pairs.add(tempList);
            }
        }

        return pairs;
    }

    public static void print(List<List<Integer>> pairs) {
        for (List<Integer> pair : pairs) {
            System.out.println(Arrays.toString(pair.toArray()));
        }
    }

    public static void main(String[] args) {
	// write your code here
        print(minimumAbsDifference(new int[] {4,2,1,3}));
//        print(minimumAbsDifference(new int[] {3,8,-10,23,19,-4,-14,27}));
//        print(minimumAbsDifference(new int[] {40,11,26,27,-20}));
//        print(minimumAbsDifference(new int[] {1,3,6,10,15}));
    }
}
