package linkedlist;

public class sumOfNLastElements {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int sum = sum(head, 3);
        System.out.print(sum);
    }
    public static int sum(Node head, int k){
        if(head == null && k<= 0){
            return 0;
        }

        int length =0;
        Node current = head;

        while(current!=null){
            length++;
            current = current.next;
        }

        current = head;

        for(int i=0; i<length-k; i++){
            current = current.next;
        }

        int sum =0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }

        return sum;

    }
}
