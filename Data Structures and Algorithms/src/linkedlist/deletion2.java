package linkedlist;

public class deletion2 {

    static void deleteNodeIterative(Node head, int position){
        if(head == null)
            return;

        Node current = head;
        Node previous = null;

        for (int i=1; current != null && i<position; i++){
            previous = current;
            current = current.next;
        }

        if(current == null)
            return;

        if(previous!=null)
            previous.next = current.next;
        else
            head = current.next;
    }

    static void deleteNodeRecursive(Node head, int position){
       deleteNodeHelper(head, position);
    }

    static Node deleteNodeHelper(Node head, int position){
        if(head == null)
            return null;

        if(position  == 1)
            return head.next;

        head.next = deleteNodeHelper(head.next, position-1);
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Demonstrate iterative deletion at position 3
        int positionToDelete = 3;
        System.out.println("\nDeleting Node at Position " + positionToDelete + " (Iterative):");
        deleteNodeIterative(head, positionToDelete);
        printList(head);

        // Resetting the linked list
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Demonstrate recursive deletion at position 2
        positionToDelete = 2;
        System.out.println("\nDeleting Node at Position " + positionToDelete + " (Recursive):");
        deleteNodeRecursive(head, positionToDelete);
        printList(head);
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
