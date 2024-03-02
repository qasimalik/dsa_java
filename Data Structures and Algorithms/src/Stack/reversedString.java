package Stack;

import java.util.Stack;

public class reversedString {
    public static String reverse(String input){
        Stack<Character> stack = new Stack<>();
        for(char c: input.toCharArray()){
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "GeeksQuiz";
        String reverse = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverse);
    }
}
