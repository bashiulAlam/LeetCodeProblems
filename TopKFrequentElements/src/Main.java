import java.util.*;

public class Main {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!frequency.containsKey(nums[i]))
                frequency.put(nums[i], 1);
            else frequency.put(nums[i], frequency.get(nums[i]) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(frequency.entrySet());
        Collections.sort(list , new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> e1 , Map.Entry<Integer,Integer> e2)
            {
                return e2.getValue()-e1.getValue();
            }
        });
        int[] result = new int[k];
        int index = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            if (index == k)
                break;
            result[index] = e.getKey();
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
