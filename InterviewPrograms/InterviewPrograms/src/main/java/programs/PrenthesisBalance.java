package programs;

import java.util.Stack;

public class PrenthesisBalance {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.length() == 0 || str.length() == 1) {
            return false;
        }

        for (Character c : str.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String args[]) {
        System.out.println(isBalanced("([{]})"));
    }
}
