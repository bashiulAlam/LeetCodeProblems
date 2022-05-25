public class Main {

    public static int percentageLetter(String s, char letter) {
        int charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                charCount++;
        }
        System.out.println("char count : " + charCount);
        double percentage = ((double) charCount / (double) s.length()) * 100;
        System.out.println("percentage : " + percentage);

        return (int) Math.floor(percentage);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("sgawtb", 's'));
    }
}
