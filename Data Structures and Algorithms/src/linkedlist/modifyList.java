package linkedlist;

public class modifyList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(6);

        Node ex = modify(head);

        printList(ex);

//        System.out.print(getLength(ex));

    }

    public static Node modify(Node head){
        int size = getLength(head);
        Node curr = head;
        Node rev = reverseList(head);
        if (size%2==0){
            for(int i =0; i <= size/2 && rev != null && curr != null; i++) {
                rev.data = rev.data - curr.data;
                rev = rev.next;
                curr = curr.next;
            }
        } else {
                for (int i = 0; i <= size+1 / 2 && rev != null && curr != null; i++) {
                    rev.data = rev.data - curr.data;
                    rev = rev.next;
                    curr = curr.next;
                }
            }
        return rev;
    }

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
