import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static List<String> topKFrequent(String[] words, int k) {
        ConcurrentHashMap<String, Integer> wordCount = new ConcurrentHashMap<>();
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (wordCount.containsKey(word))
                wordCount.put(word, wordCount.get(word) + 1);
            else wordCount.put(word, 1);
        }

        while (result.size() < k) {
            int max = Integer.MIN_VALUE;
            List<String> tempList = new ArrayList<>();
            for (Map.Entry<String, Integer> e : wordCount.entrySet()) {
                if (e.getValue() > max)
                    max = e.getValue();
            }

            for (Map.Entry<String, Integer> e : wordCount.entrySet()) {
                if (e.getValue() == max) {
                    tempList.add(e.getKey());
                    wordCount.remove(e.getKey());
                }
            }
            if (tempList.size() > 1)
                Collections.sort(tempList);

            for (String s : tempList) {
                result.add(s);
                if (result.size() == k)
                    break;
            }
        }

        return result;
    }

    public static void printList(List<String> list) {
        for (String i : list)
            System.out.println(i);

    }

    public static void main(String[] args) {
	// write your code here
//        printList(topKFrequent(new String[] {"i","love","leetcode","i","love","coding"}, 2));
        printList(topKFrequent(new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
    }
}
