package doublyLinkedList;

import java.text.BreakIterator;

class Main{
    Node head;

    public Node mergeSort(Node head){
        if(head == null ||  head.next == null){
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;
        nextOfMiddle.prev = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    private Node merge(Node left, Node right){
        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }

        Node result;

        if(left.data <= right.data){
            result = left;
            result.next = merge(left.next, right);
            result.next.prev = result;
        } else {
            result = right;
            result.next = merge(left, right.next);
            result.next.prev = result;
        }
        return result;
    }

    private Node getMiddle(Node head){
        if(head == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }

    public void sort(){
        head = mergeSort(head);
    }

    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class Sorting {
    public static void main(String[] args) {
        Main m = new Main();
        m.head = new Node(3);
        m.head.next = new Node(2);
        m.head.next.prev = m.head;
        m.head.next.next = new Node(4);
        m.head.next.next.prev = m.head.next;
        m.head.next.next.next = new Node(1);
        m.head.next.next.next.prev = m.head.next.next;

        System.out.println("Original Doubly Linked List:");
        m.display();

        // Sort the list
        m.sort();

        // Display the sorted list
        System.out.println("\nSorted Doubly Linked List:");
        m.display();
    }
}
