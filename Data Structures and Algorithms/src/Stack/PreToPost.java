package Stack;

import java.util.Stack;

public class PreToPost {

    public static boolean isOperand(char x){
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public static String preTopost(String str){
        Stack<String> stack = new Stack<>();
        int l = str.length();
        for(int i = l -1; i>= 0; i--){
            char c = str.charAt(i);
            if(isOperand(c)){
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        return stack.peek();
    }

    public static String postToPre(String str){
        Stack<String> stack = new Stack<String>();
        int l = str.length();
        for (int i = 0; i < l; i++){
            char c = str.charAt(i);
            if (isOperand(c)){
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();

                String temp = c + op2 + op1 ;
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }

        String ans = "";
        for(String i: stack)
                ans += i;

        return ans;
    }

    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Prefix  : "
                + pre_exp);
        String postfix = preTopost(pre_exp);
        System.out.println("Postfix : "
                + postfix);
        String prefix = postToPre(postfix);
        System.out.println("Prefix  : "
                + prefix);
    }
}
