public class Main {

    public static String sortingSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int index = (word.charAt(word.length() - 1) - '0') - 1;
            result[index] = word.substring(0, word.length() - 1);
        }

        StringBuilder sortedSentence = new StringBuilder();
        for (String word : result)
            sortedSentence.append(word).append(" ");

        return sortedSentence.toString().trim();
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(sortingSentence("KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1"));
        System.out.println(sortingSentence("eHwJm5 xvJDHiymHBeCO2 uQjltjGlmIPdeOHsXSuD1 Vgf3 yXacYhRKVGlvukQRMal4"));
    }
}
