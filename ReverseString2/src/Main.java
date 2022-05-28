public class Main {

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length()) {
            System.out.println("main loop block");
            int start = i;
            int end = Math.min(start + k - 1, sb.length() - 1);
            while (start < end) {
                char tempChar = sb.charAt(end);
                sb.setCharAt(end, sb.charAt(start));
                sb.setCharAt(start, tempChar);

                start++;
                end--;
            }

            i += (2 * k);
        }

        /*if (sb.length() - i > 1 && sb.length() - i < k) {
            System.out.println("less than k left block");
            for (int j = 0; j < (sb.length() - i) / 2; j++) {
                System.out.println("swapping : " + sb.charAt(i + j) + " and " + sb.charAt(sb.length() - j - 1));
                char tempChar = sb.charAt(i + j);
                sb.setCharAt(i + j, sb.charAt(sb.length() - j - 1));
                sb.setCharAt(sb.length() - j - 1, tempChar);
            }
        } else if (sb.length() - i < (2 * k) && sb.length() - i >= k) {
            System.out.println("less than 2k left block, value of i : " + i);
            for (int j = 0; j < k / 2; j++) {
                System.out.println("swapping : " + sb.charAt(i + j) + " and " + sb.charAt(i + k - j - 1));
                char tempChar = sb.charAt(i + j);
                sb.setCharAt(i + j, sb.charAt(i + k - j - 1));
                sb.setCharAt(i + k - j - 1, tempChar);
            }
        }*/

        return sb.toString();
    }

    public static void main(String[] args) {
	// write your code here
//        System.out.println(reverseStr("krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc", 20));
        System.out.println(reverseStr("abcdefg", 1213));
//        System.out.println(reverseStr("abcdefgh", 2));
//        System.out.println(reverseStr("abcd", 2));
//        System.out.println(reverseStr("abcd", 4));
//        System.out.println(reverseStr("abcd", 1));
    }
}
