import java.util.*;

public class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> elements = new ArrayList<Integer>();

        if (nums.length == 1)
            elements.add(nums[0]);
        else {
            int count = Math.floorDiv(nums.length, 3);
            System.out.println("count : " + count);
            HashMap<Integer, Integer> occurence = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (!occurence.containsKey(nums[i]))
                    occurence.put(nums[i], 1);
                else {
                    int elemCount = occurence.get(nums[i]);
                    occurence.put(nums[i], elemCount + 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : occurence.entrySet()) {
                if (entry.getValue() > count)
                    elements.add(entry.getKey());
            }
        }

        return elements;
    }

    public void printelems(List<Integer> elements) {
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();
    }
}
