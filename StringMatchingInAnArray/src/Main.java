import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            int index = i + 1;
            while (count < words.length - 1) {
                if (index == words.length)
                    index = 0;

                //System.out.println("at index : " + words[index] + ", at i : " + words[i]);
                if (words[i].length() <= words[index].length()) {
                    if (words[index].contains(words[i])) {
                        //System.out.println("comparing : " + words[index] + ", contains : " + words[i]);
                        if (!list.contains(words[i]))
                            list.add(words[i]);
                        else break;
                    }
                }
                count++;
                index++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringMatching(new String[] {"mass","as","hero","superhero"}));
        System.out.println(stringMatching(new String[] {"leetcode","et","code"}));
        System.out.println(stringMatching(new String[] {"blue","green","bu"}));
        System.out.println(stringMatching(new String[] {"bue","bu","bu"}));
    }
}
