class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class ex1{
    public staic void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int length = findlength(head);
        System.out.print("Length: " + length);

    }

    public static findlength(Node head){
        int count = 0;
        while(head != null){
            count++;
            head= head.next;
        }
        return count;
    }
}