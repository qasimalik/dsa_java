package Stack;

import static java.lang.System.exit;

class stack{
    private class Node{
        int data;
        Node link;
    }

    Node top;

    stack(){
        this.top = null;
    }

    public void push(int x){
        Node temp = new Node();
        if(temp == null){
            System.out.println("\nHeap overflow");
            return;
        }

        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("\nStack underflow");
            return;
        }
        top = (top).link;
    }

    public void display(){
        if(top == null){
            System.out.println("\n Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null){
                System.out.print(temp.data);
                temp = temp.link;
                if(temp != null){
                    System.out.print("->");
                }
            }
        }
    }
}
public class intro {
    public static void main(String[] args) {
        stack stk = new stack();
        stk.push(11);
        stk.push(22);
        stk.push(33);
        stk.push(44);

        stk.display();

        System.out.printf("\nTop Element is %d\n", stk.peek());

        stk.pop();
        stk.pop();
        stk.display();

        System.out.printf("\nTop Element is %d\n", stk.peek());
    }
}
