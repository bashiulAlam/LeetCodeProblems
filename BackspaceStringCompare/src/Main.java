public class Main {

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (sbS.length() > 0)
                    sbS.deleteCharAt(sbS.length() - 1);
            } else sbS.append(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (sbT.length() > 0)
                    sbT.deleteCharAt(sbT.length() - 1);
            } else sbT.append(t.charAt(i));
        }

        System.out.println("S: " + sbS + ", T: " + sbT);

        return sbS.toString().equals(sbT.toString());
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}
