package linkedlist;

public class element {
    public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    findElement(head);
    }

    public static void findElement(Node head){
        int element = 0;
        if(head == null){
            return;
        }
        while(head != null){
            element = head.data;
        System.out.print(element + " ");
            head = head.next;
        }
    }
}
