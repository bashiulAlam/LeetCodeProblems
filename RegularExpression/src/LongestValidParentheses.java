import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int count = 0;

        Deque<Integer> paren = new ArrayDeque<>();
        paren.push(-1);
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(')
                paren.push(i);
            if (c[i] == ')') {
                paren.pop();
                if (!paren.isEmpty()) {
                    int diff = i - paren.getFirst();
                    if (diff > count)
                        count = diff;
                } else paren.push(i);
            }
        }

        return count;
    }
}
