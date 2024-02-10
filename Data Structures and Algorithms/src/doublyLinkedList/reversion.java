package doublyLinkedList;

public class reversion {
    Node head;

    public static void main(String[] args) {
        doubleLinkedList list = new doubleLinkedList();

        // Add nodes to the list
        list.head = new Node(3);
        list.head.next = new Node(2);
        list.head.next.prev = list.head;
        list.head.next.next = new Node(4);
        list.head.next.next.prev = list.head.next;
        list.head.next.next.next = new Node(1);
        list.head.next.next.next.prev = list.head.next.next;
        list.reverse();

        System.out.println("Reversed Doubly Linked List:");
        list.printList();
    }
}
