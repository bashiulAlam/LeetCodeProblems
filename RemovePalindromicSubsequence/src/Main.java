public class Main {

    public static int removePalindromeSub(String s) {
        int count = 0;
        while (s.length() > 0) {
            int maxLength = 1, start = 0;

            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    int flag = 1;
                    for (int k = 0; k < (j - i + 1) / 2; k++) {
                        if (s.charAt(i + k) != s.charAt(j - k)) {
                            flag = 0;
                            break;
                        }
                    }

                    if (flag != 0 && (j - i + 1) > maxLength) {
                        start = i;
                        maxLength = j - i + 1;
                    }
                }
            }
            String palindromeStr = s.substring(start, start + maxLength);
            System.out.println("palindromeStr : " + palindromeStr);
            s = s.replaceAll(palindromeStr, "");
            System.out.println("after removal : " + s);
            count++;
        }

        return count;
    }

    public static String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;

            while (right < s.length() && s.charAt(i) == s.charAt(right))
                right++;

            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                } else break;
            }

            if (s.substring(left + 1, right).length() > longestPalindrome.length())
                longestPalindrome = s.substring(left + 1, right);
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        // write your code here
        //System.out.println(removePalindromeSub("ababa"));
        //System.out.println(removePalindromeSub("abba"));
//        System.out.println(removePalindromeSub("abbab"));
//        System.out.println(removePalindromeSub("abb"));
//        System.out.println(removePalindromeSub("baabb"));
        System.out.println(longestPalindrome("bbaabaaa"));
    }
}
