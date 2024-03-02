package Stack;

import java.util.Stack;

public class evalExp {

    public static int evaluateExp(String exp){
        Stack<Integer> operandStack = new Stack<>();

        for(char c: exp.toCharArray()){
            if(Character.isDigit(c)){
                operandStack.push(c - '0');
            } else if (c == '+' || c == '-' || c == '*' || c == '/'){
                int op2 = operandStack.pop();
                int op1 = operandStack.pop();
                int result = performOp(c, op1, op2);
                operandStack.push(result);
            }
        }

        return operandStack.pop();
    }

    public static int performOp(int operator, int op1, int op2){
        switch (operator){
            case '+':
                return op1 + op2;
            case '-':
                return op1-op2;
            case '*':
                return op1 * op2;
            case '/':
                if(op2 == 0){
                    throw new ArithmeticException("Division by Zero");
                }
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Invalid Operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String postfixExpression = "100 200 + 2 / 5 * 7 +";
        int result = evaluateExp(postfixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Result: " + result);
    }
}
