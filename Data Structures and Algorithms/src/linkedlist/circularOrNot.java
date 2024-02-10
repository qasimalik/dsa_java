package linkedlist;

public class circularOrNot {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        boolean result = isCircular(head);
        System.out.println("Is the linked list circular? " + result);
    }

    public static boolean isCircular(Node head){
        if(head == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
