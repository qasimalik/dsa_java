package Stack;
import java.util.*;

public class infin {

    private static final Map<Character, Integer> precedence = Map.of(
            '+', 1,
            '-', 1,
            '*', 2,
            '/', 2,
            '^', 3
    );

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Discard the '('
            } else {
                // Operator encountered
                while (!stack.isEmpty() && precedence.getOrDefault(stack.peek(), 0) >= precedence.get(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Append remaining operators in the stack to the postfix expression
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    static boolean isOperand(char x){
        return (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z');
    }

    static String getInfin(String str){
        Stack <String> s = new Stack<String>();
        int l = str.length();
        for (int i = 0; i < l; i++) {
            char x = str.charAt(i);
            if(isOperand(x)){
                s.push(x+ "");
            } else {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op2 + x + op1 + ")");
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);

        String infixExp = getInfin("ab*c+");
        System.out.println("Infix Expression: " + infixExp);
    }
}
