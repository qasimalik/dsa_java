package linkedlist;

public class mSort {
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(13);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.println("Original Linked List:");
        printList(head);

        // Sort and print the result
        Node sortedList = mergeSort(head);
        System.out.println("Sorted Linked List (Iterative):");
        printList(sortedList);
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        int length = getLength(head);
        Node dummy = new Node(0);
        dummy.next = head;

        for(int size=1; size < length; size *= 2){
            Node current = dummy.next;
            Node tail = dummy;

            while(current != null){
                Node left = current;
                Node right = split(left, size);
                current = split(right, size);

                Node merged = merge(left, right);
                tail.next = merged;

                while(tail.next != null){
                    tail = tail.next;
                }
            }
        }

        return dummy.next;
    }

    private static Node split(Node head, int size){
        if(head == null){
            return null;
        }

        for(int i =1; i<size && head.next != null; i++){
            head = head.next;
        }

        Node secondHalf = head.next;
        head.next = null;

        return secondHalf;
    }

    public static Node merge(Node head1, Node head2){
        Node dummy = new Node(0);
        Node current = dummy;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if(head1 != null){
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next;
    }

    public static int getLength(Node head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }

        return length;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
