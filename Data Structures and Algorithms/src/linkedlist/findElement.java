package linkedlist;

public class findElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int element = 12;
       if(findN(head, element)){
           System.out.println("Found!");
       } else {
           System.out.println("Not found");
       }
    }

    public static boolean findN(Node node, int n){
        while (node != null) {
            if (node.data == n) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
