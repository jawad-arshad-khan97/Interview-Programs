package programs;

import java.util.Stack;

public class PrefixToInfix {

    static boolean isOperator(Character x){
        switch (x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }
public static String convert(String str){
    Stack<String> stack = new Stack<>();
    int l = str.length();

    for(int i= l-1; i>=0; i--){
        char c = str.charAt(i);

        if(isOperator(c)){
            String operand1 = stack.pop();
            String operand2 = stack.pop();

            String temp = "(" + operand1 + c+ operand2+ ")";
            stack.push(temp);
        }
        else {
            stack.push(c + "");
        }
    }
    return stack.pop();
}


}