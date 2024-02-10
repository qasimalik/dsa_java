package linkedlist;

public class reverseEveryKNodes {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);
//        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse every 2 nodes and print the result
        int k = 3;
        head = reverseKNodes(head, k);
        System.out.println("Linked List after reversing every " + k + " nodes:");
        printList(head);
    }

    public static Node reverseKNodes(Node head, int k){
        if(head == null || k <= 1){
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (head != null) {
            // Check if there are at least k nodes remaining
            Node tail = getKthNode(head, k);
            if (tail == null) {
                break;
            }

            Node nextGroupStart = tail.next;
            tail.next = null; // Disconnect the group to reverse
            prev.next = reverseLinkedList(head); // Reverse the group
            head.next = nextGroupStart; // Connect the reversed group to the remaining list

            prev = head;
            head = nextGroupStart;
        }

        return dummy.next;
    }

    private static Node getKthNode(Node head, int k){
        for (int i = 1; i < k && head != null; i++) {
            head = head.next;
        }
        return head;
    }

    private static Node reverseLinkedList(Node head){
        Node current = head;
        Node next  = null;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
