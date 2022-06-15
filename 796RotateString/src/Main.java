public class Main {

    //this method does not work if we have repeated characters
    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal))
            return true;
        else if (s.length() == 1 && goal.length() == 1 && !s.equals(goal))
            return false;
        else if ((s.length() == 1 && goal.length() > 1) || (s.length() > 1 && goal.length() == 1))
            return false;
        else {
            int index = goal.indexOf(s.charAt(0));
            /*System.out.println("s.charAt(s.length() - 1) : " + s.charAt(s.length() - 1));
            System.out.println("goal.charAt(index - 1) : " + goal.charAt(index - 1));
            System.out.println("s.substring(s.length() - index) :" + s.substring(s.length() - index));
            System.out.println("goal.substring(0, index) :" + goal.substring(0, index));*/

            if (index == 0)
                return false;
            else if (s.charAt(s.length() - 1) == goal.charAt(index - 1) && s.substring(s.length() - index).equals(goal.substring(0, index)))
                return true;
            else return false;
        }
    }

    public static boolean rotateString2(String s, String goal) {
        if (s.equals(goal))
            return true;
        else if (s.length() != goal.length())
            return false;
        else return s.concat(s).contains(goal);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(rotateString2("abcde","cdeab"));
        System.out.println(rotateString2("abcde","abced"));
        System.out.println(rotateString2("aaabc","aabca"));
    }
}
