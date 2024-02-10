package linkedlist;

public class deletion {

    public static Node deleteAtBeginning(Node head){
        if(head == null){
            System.out.println("List is empty. Nothing to delete");
            return null;
        }

        Node newHead = head.next;
        head.next = null;               // disconnect the deleted node
        return newHead;
    }

    public static Node deleteAtEnd(Node head){
        if(head == null){
            System.out.println("List is empty. Nothing to delete");
            return null;
        }

        if(head.next == null){
            return null;                // only one element is there
        }

        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }

        current.next = null;

        return head;

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("Original Linked List:");
        printList(head);

        head = deleteAtBeginning(head);

        System.out.println("\nLinked List after Deleting at Beginning:");
        printList(head);

        head = deleteAtEnd(head);

        System.out.println("\nLinked List after Deleting at End:");
        printList(head);

    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
