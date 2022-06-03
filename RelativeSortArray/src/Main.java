import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> elementMap = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (elementMap.containsKey(arr1[i]))
                elementMap.put(arr1[i], elementMap.get(arr1[i]) + 1);
            else elementMap.put(arr1[i], 1);
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = elementMap.get(arr2[i]);
            for (int j = 0; j < count; j++) {
                arr1[index] = arr2[i];
                index++;
            }
            elementMap.remove(arr2[i]);
        }

        for (Map.Entry<Integer, Integer> e : elementMap.entrySet()) {
            int count = e.getValue();
            for (int i = 0; i < count; i++) {
                arr1[index] = e.getKey();
                index++;
            }
        }

        return arr1;
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
//        print(relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6}));
        print(relativeSortArray(new int[] {28,6,22,8,44,17}, new int[] {22,28,8,6}));
    }
}
