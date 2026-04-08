package StacksAnQueues.Questions;
import java.util.Stack;

public class MinValid {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insertions = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                i++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    insertions++;
                    i++;
                }

                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    insertions++;
                }
            }
        }

        insertions += 2 * stack.size();
        return insertions;
    }
}
