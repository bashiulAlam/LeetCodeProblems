public class Main {

    public static void main(String[] args) {
        System.out.println("index : " + strStr("hello", "ll"));
        System.out.println("index : " + strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        else {
            if (!haystack.contains(needle))
                return -1;
            else {
                /*int index = 0;
                for (int i = 0; i < haystack.length(); i++) {
                    if (haystack.charAt(i) == needle.charAt(0)) {
                        index = i;
                        break;
                    }
                }
                return index;*/

                return haystack.indexOf(needle);
            }
        }
    }
}
