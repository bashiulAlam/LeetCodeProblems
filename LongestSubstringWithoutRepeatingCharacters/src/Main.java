import java.util.HashMap;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        else if (s.length() == 1)
            return 1;
        else {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int duplicate = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), i);
                } else {
                    if (map.get(s.charAt(i)) >= duplicate)
                        duplicate = map.get(s.charAt(i)) + 1;
                    System.out.println("duplicate changed for " + s.charAt(i) + ", value : " + duplicate);
                    map.put(s.charAt(i), i);
                }

                if (i - duplicate + 1 > max)
                    max = i - duplicate + 1;
                System.out.println("max changed : " + max);
            }

            return max;
        }
    }

    public static void main(String[] args) {
        // write your code here
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));
        //System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        //System.out.println(lengthOfLongestSubstring("au"));
        //System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
