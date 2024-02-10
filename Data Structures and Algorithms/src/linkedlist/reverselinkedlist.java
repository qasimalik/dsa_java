package linkedlist;

public class reverselinkedlist {

    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);

        Node headNext = head.next;

        headNext.next = head;

        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseList(head);

        System.out.println("\nReversed Linked List Through Iterative:");
        printList(head);

        head = reverse(head);

        System.out.println("\nAgain Reversed Linked List Through Recursive:");
        printList(head);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
