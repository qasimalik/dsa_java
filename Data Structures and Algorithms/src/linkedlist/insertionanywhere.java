package linkedlist;

class LinkedList {
    Node head;

    // Function to insert a node at a given position
    void insertNodeAtPosition(int position, int data) {
        Node newNode = new Node(data);

        // If the position is 1, insert at the beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            // Traverse to the node at position - 1
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }

            // If the position is beyond the end of the list, do nothing
            if (temp == null) {
                System.out.println("Invalid position. Node not inserted.");
                return;
            }

            // Insert the new node at the specified position
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class insertionanywhere {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNodeAtPosition(1, 10);
        list.insertNodeAtPosition(2, 20);
        list.insertNodeAtPosition(3, 30);

        System.out.println("Original Linked List:");
        list.printList();

        list.insertNodeAtPosition(2, 15);

        System.out.println("Linked List after insertion:");
        list.printList();

    }
}
