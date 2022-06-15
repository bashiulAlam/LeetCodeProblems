import java.util.Arrays;

public class Main {

    public static int minDistance(String word1, String word2) {
        if (word1.length() > word2.length() && word1.contains(word2))
            return word1.length() - word2.length();
        else if (word2.length() > word1.length() && word2.contains(word1))
            return word2.length() - word1.length();
        else {
            int[] word1Content = new int[26];
            int[] word2Content = new int[26];
            Arrays.fill(word1Content, 0);
            Arrays.fill(word2Content, 0);
            int commonLength = 0;

            for (char c : word1.toCharArray())
                word1Content[c - 'a']++;

            for (char c : word2.toCharArray())
                word2Content[c - 'a']++;

            for (int i = 0; i < 26; i++) {
                if (word1Content[i] != 0 && word2Content[i] != 0) {
                    if (word1Content[i] == word2Content[i])
                        commonLength += (2 * word1Content[i]);
                    else if (word1Content[i] < word2Content[i])
                        commonLength += (2 * word1Content[i]);
                    else commonLength += (2 * word2Content[i]);
                }
            }

            return word1.length() + word2.length() - commonLength;
        }
    }

    public static int minDistance2(String word1, String word2) {
        if (word1.length() > word2.length() && word1.contains(word2))
            return word1.length() - word2.length();
        else if (word2.length() > word1.length() && word2.contains(word1))
            return word2.length() - word1.length();
        else {
            int[][] wordTable = new int[word1.length() + 1][word2.length() + 1];
            for (int i = 0; i < word1.length() + 1; i++) {
                for (int j = 0; j < word2.length() + 1; j++) {
                    if (i == 0 || j == 0)
                        wordTable[i][j] = 0;
                    else {
                        if (word1.charAt(i - 1) == word2.charAt(j - 1))
                            wordTable[i][j] = 1 + wordTable[i-1][j - 1];
                        else wordTable[i][j] = Math.max(wordTable[i - 1][j], wordTable[i][j - 1]);
                    }
                }
            }

            return word1.length() + word2.length() - (2 * wordTable[word1.length()][word2.length()]);
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(minDistance2("sea", "eat"));
        System.out.println(minDistance2("leetcode", "etco"));
        System.out.println(minDistance2("meh", "bro"));
        System.out.println(minDistance2("meh", "a"));
        System.out.println(minDistance2("a", "bro"));
        System.out.println(minDistance2("seashell", "class"));
        System.out.println(minDistance2("seashell", "a"));
        System.out.println(minDistance2("a", "a"));
        System.out.println(minDistance2("a", "b"));
    }
}
