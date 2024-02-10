package linkedlist;

public class swaplinkedlist {
    Node head;
    static void printLinkedList(Node head) {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("LinkedList before swapping: ");
        printLinkedList(head);
        System.out.println();
        System.out.println("Linkedlist after swapping");
        head = swapNodes(head, 4, 7);
        printLinkedList(head);

    }

    public static Node swapNodes(Node node,int x, int y){
        if(node == null || node.next == null){
            return node;
        }

        Node t1, t2, head, prev1, prev2;

        prev1 = prev2 = t1 = t2 = null;

        head = node;

        while(node != null){
            if(node.data == x){
                t1 = node;
                break;
            }
            prev1 = node;
            node = node.next;
        }

        node = head;

        while(node != null){
            if(node.data == y){
                t2 = node;
                break;
            }
            prev2 = node;
            node = node.next;
        }

        if(t1 == null || t2 == null){
            return head;
        }

        if(prev1 != null){
            prev1.next = t2;
        } else {
            head = t2;
        }

        if(prev2 != null){
            prev2.next = t1;
        } else {
            head = t1;
        }

        Node temp = t1.next;
        t1.next = t2.next;
        t2.next = temp;

        return head;
    }
}
