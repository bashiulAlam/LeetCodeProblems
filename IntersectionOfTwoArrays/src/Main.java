import java.util.*;

public class Main {

    //349
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums1) {
            if (!numSet.contains(i))
                numSet.add(i);
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int i : nums2) {
            if (numSet.contains(i)) {
                intersectionList.add(i);
                numSet.remove(i);
            }
        }

        int[] intersectionArr = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++)
            intersectionArr[i] = intersectionList.get(i);

        return intersectionArr;
    }

    //350
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1Map = new LinkedHashMap<>();
        for (int i : nums1) {
            if (!nums1Map.containsKey(i))
                nums1Map.put(i, 1);
            else nums1Map.put(i, nums1Map.get(i) + 1);
        }

        HashMap<Integer, Integer> nums2Map = new LinkedHashMap<>();
        for (int i : nums2) {
            if (!nums2Map.containsKey(i))
                nums2Map.put(i, 1);
            else nums2Map.put(i, nums2Map.get(i) + 1);
        }

        Set<Integer> num1Key = nums1Map.keySet();
        Set<Integer> num2Key = nums2Map.keySet();
        List<Integer> intersectionList = new ArrayList<>();
        for (Integer key : num1Key) {
            if (num2Key.contains(key)) {
                int num1Count = nums1Map.get(key);
                int num2Count = nums2Map.get(key);
                if (num1Count <= num2Count) {
                    for (int i = 0; i < num1Count; i++)
                        intersectionList.add(key);
                } else {
                    for (int i = 0; i < num2Count; i++)
                        intersectionList.add(key);
                }
            }
        }

        int[] intersectionArr = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++)
            intersectionArr[i] = intersectionList.get(i);

        return intersectionArr;
    }

    public static void main(String[] args) {
	// write your code here
        //System.out.println(Arrays.toString(intersection(new int[] {1,2,2,1}, new int[] {2,2})));
        //System.out.println(Arrays.toString(intersection(new int[] {4,9,5}, new int[] {2,2})));
        //System.out.println(Arrays.toString(intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4})));

        System.out.println(Arrays.toString(intersect(new int[] {1,2,2,1}, new int[] {2,2})));
        System.out.println(Arrays.toString(intersect(new int[] {4,9,5}, new int[] {2,2})));
        System.out.println(Arrays.toString(intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4})));
    }
}
