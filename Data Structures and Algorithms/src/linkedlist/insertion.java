package linkedlist;

public class insertion {
    public static void main(String[] args) {
        Node head = null;

        // Inserting nodes at the beginning.
        head = insertAtBeginning(head, 3);
        head = insertAtBeginning(head, 2);
        head = insertAtBeginning(head, 1);

        // Displaying the linked list after insertions at the beginning.
        System.out.println("Linked list after insertions at the beginning:");
        printLinkedList(head);

        // Inserting nodes at the end.
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);

        // Displaying the linked list after insertions at the end.
        System.out.println("Linked list after insertions at the end:");
        printLinkedList(head);
    }

    public static Node insertAtBeginning(Node head, int x){
        Node newNode = new Node(x);
        newNode.next = head;

        head = newNode;

        return head;

    }

    public static Node insertAtEnd(Node head, int x){
        Node newNode = new Node(x);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }

        return head;
    }

    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
