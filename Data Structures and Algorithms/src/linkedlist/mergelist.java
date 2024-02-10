package linkedlist;

public class mergelist {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        System.out.println("List 1: ");
        printList(head1);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("List 2: ");
        printList(head2);

        Node merge = mergeLinkedList(head1, head2);

        System.out.println("Merged List: ");
        printList(merge);
    }

//    Iterative approach
//    public static Node mergeLinkedList(Node head1, Node head2){
//        Node dummy = new Node(0);
//        Node current = dummy;
//
//        while(head1 != null && head2 != null){
//            if(head1.data < head2.data){
//                current.next = head1;
//                head1 = head1.next;
//            } else {
//                current.next = head2;
//                head2 = head2.next;
//            }
//            current = current.next;
//        }
//
//        if(head1 != null){
//            current.next = head1;
//        } else {
//            current.next = head2;
//        }
//
//        return dummy.next;
//    }

// Recursive Approach
    public static Node mergeLinkedList(Node head1, Node head2){
        Node mergeHead;
        if(head1 == null){
            return head1;
        }

        if(head2 == null){
            return head2;
        }

        if(head1.data < head2.data){
            mergeHead = head1;
            mergeHead.next = mergeLinkedList(head1.next, head2);
        } else {
            mergeHead = head2;
            mergeHead.next = mergeLinkedList(head1, head2.next);
        }

        return mergeHead;
    }
    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
