import java.util.*;

public class Main {

    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!charCount.containsKey(s.charAt(i)))
                charCount.put(s.charAt(i), 1);
            else charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> e : charCount.entrySet()) {
            if (e.getValue() == 1)
                return s.indexOf(e.getKey());
        }

        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("loveleetcode"));
        System.out.println(firstUniqueChar("aabb"));
    }
}
