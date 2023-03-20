package programs;

import java.util.Stack;

public class BalanceParenthesis {
    class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (Character ch : s.toCharArray()) {
                switch (ch) {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(ch);
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
    }
}
