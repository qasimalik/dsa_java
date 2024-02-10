package linkedlist;

public class identicalOrNot {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(5);

        boolean result = isIdentical(head1, head2);
        if (result) {
            System.out.println("Linked lists are identical.");
        } else {
            System.out.println("Linked lists are not identical.");
        }
    }

    public static boolean isIdentical (Node head1, Node head2){
        //write your code here
        while(head1!=null && head2 != null) {
            if (head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1==null && head2 == null);
    }
}
