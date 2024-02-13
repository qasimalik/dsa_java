package Stack;

import java.util.Stack;

public class balancedParanthesis {

    public static boolean isBalanced(String exp){
        Stack<Character> stack =  new Stack<>();

        for(char c: exp.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "[()]{}{[()()]()}";
        String expression3 = "{[}";

        System.out.println("Expression 1 is valid: " + isBalanced(expression1));
        System.out.println("Expression 2 is valid: " + isBalanced(expression2));
        System.out.println("Expression 3 is valid: " + isBalanced(expression3));
    }
}
