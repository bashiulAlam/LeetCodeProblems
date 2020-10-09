public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        prefix = commonPrefix(strs, 0, strs.length - 1);

        return prefix;
    }

    static String commonPrefix(String arr[], int low, int high) {
        if (low == high) {
            return (arr[low]);
        }

        if (high > low) {
            int mid = low + (high - low) / 2;

            String str1 = commonPrefix(arr, low, mid);
            String str2 = commonPrefix(arr, mid + 1, high);

            String result = "";

            for (int i = 0, j = 0; i < str1.length() &&  j < str2.length(); i++, j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    break;
                }
                result += str1.charAt(i);
            }

            return result;
        }

        return "";
    }
}
