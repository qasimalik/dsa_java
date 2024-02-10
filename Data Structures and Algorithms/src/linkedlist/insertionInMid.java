package linkedlist;

public class insertionInMid {
    public static void main(String[] args) {

    }
    public static Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list

        if(head==null){
            return new Node(data);
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode =  new Node(data);

        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}
