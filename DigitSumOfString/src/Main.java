import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            ArrayList<String> subStrList = new ArrayList<String>();
            int i = 0;
            while (s.length() - i >= k) {
                subStrList.add(s.substring(i, i + k));
                i += k;
            }
            if (s.length() - i > 0)
                subStrList.add(s.substring(i));

            for (int a = 0; a < subStrList.size(); a++) {
                int sum = 0;
                for (int j = 0; j < subStrList.get(a).length(); j++)
                    sum += (subStrList.get(a).charAt(j) - '0');
                subStrList.set(a, String.valueOf(sum));
            }

            /*for (int j = 0; j < subStrList.size(); j++)
                System.out.print(subStrList.get(j) + " ");
            System.out.println();*/

            s = "";
            StringBuilder stringBuilder = new StringBuilder();
            for (int a = 0; a < subStrList.size(); a++)
                stringBuilder.append(subStrList.get(a));
            s = stringBuilder.toString();
            //System.out.println("new string : " + s);
        }

        return s;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(digitSum("11111222223", 3));
        System.out.println(digitSum("00000000", 3));
        System.out.println(digitSum("12345", 2));
        System.out.println(digitSum("12345", 5));
    }
}
