import java.util.*;

public class Main {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!charCount.containsKey(s.charAt(i)))
                charCount.put(s.charAt(i), 1);
            else charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
        }

        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(
                charCount.entrySet());
        Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list) {
            for (int i = 1; i <= e.getValue(); i++)
                sb.append(e.getKey());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("ttttt"));
        System.out.println(frequencySort("Aabb"));
    }
}
