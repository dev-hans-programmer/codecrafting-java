package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Problems {

    private static List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private static List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public static void main(String[] args) {
        String string = "<(a + b)>";

        System.out.println(isValidParenthesis(string));

    }

    public static String getReversedString(String str) {
        if (str == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    private static boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private static boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private static boolean isMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

    public static boolean isValidParenthesis(String string) {
        Stack<Character> stack = new Stack<>();

        for (char ch : string.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.isEmpty())
                    return false;

                var top = stack.pop();
                if (!isMatch(top, ch))
                    return false;
            }

        }

        return stack.empty();

    }
}
