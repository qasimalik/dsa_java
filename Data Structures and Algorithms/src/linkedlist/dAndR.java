package linkedlist;

public class dAndR {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(7);
        head.next.next = new Node(8);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(6);

        int valueToDelete = 8;

        // Before deletion
        System.out.println("Original Linked List:");
        printList(head);

        // Delete the node with value 'valueToDelete'
        head = deleteNode(head, valueToDelete);

        // After deletion
        System.out.println("Linked List after deleting node with value " + valueToDelete + ":");
        printList(head);

        head = reverse(head);
        System.out.println("Linked List after reversing the values:");
        printList(head);
    }

    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        if (head == null) {
            return null;
        }

        if (head.data == d) {
            return head.next;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != d) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }

        return head;

    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
