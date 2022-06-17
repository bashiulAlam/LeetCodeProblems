public class Main {

    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int index = s.indexOf(part);
            //System.out.println("first part : " + s.substring(0, index) + "\nlast part : " + s.substring(index + part.length()));
            s = s.substring(0, index) + s.substring(index + part.length());
        }

        return s;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
        System.out.println(removeOccurrences("ab", "xy"));
        System.out.println(removeOccurrences("xy", "xy"));
    }
}
