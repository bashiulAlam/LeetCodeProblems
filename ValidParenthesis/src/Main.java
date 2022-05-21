import java.util.ArrayList;

public class Main {

    public static int validParenthesis(String paren) {
        int count = 0;
        int flag = 0;
        char[] c = paren.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' && flag == 0)
                flag = 1;
            else if (c[i] == ')' && flag == 1) {
                count += 2;
                flag = 0;
            }
        }

        return count;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(validParenthesis("(()"));
        System.out.println(validParenthesis(")()())"));
        System.out.println(validParenthesis(")()())()()()))))((((()()()))))))"));
        System.out.println(validParenthesis(""));
    }
}
