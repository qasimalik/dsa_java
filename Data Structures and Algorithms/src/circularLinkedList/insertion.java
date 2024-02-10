package circularLinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
class CircularLinkedList{
    private Node head;

    public CircularLinkedList(){
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            head = newNode;
        } else {
            Node last = head;
            while (last.next != head){
                last = last.next;
            }

            newNode.next = head;
            last.next = newNode;
            head = newNode;
        }
    }

    public void insertInMiddle(int data){
        if(head == null){
            System.out.println("Cannot insert in Middle");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != head && fast.next.next != head){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node newNode = new Node(data);
        newNode.next = slow.next;
        slow.next = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        } else {
            Node last = head;
            while(last.next != head){
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    public void insertAtPosition(int data, int position){

        Node newNode = new Node(data);
        if(position <= 0){
            System.out.println("Invalid Position");
            return;
        }

        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i =1; i<position-1 && current!=null; i++){
            current = current.next;
        }

        if(current == null){
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("Circular linked list is empty");
            return;
        }

        Node current = head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class insertion{
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(7);
        cll.insert(2);
        cll.insert(1);

        System.out.println("Circular Linked list after insertion: ");
        cll.printList();

        cll.insertInMiddle(6);
        cll.insertInMiddle(3);
        cll.insertInMiddle(4);

        // Displaying the circular linked list
        System.out.println("Circular Linked List after insertion in the middle:");
        cll.printList();

        cll.insertAtEnd(8);
        cll.insertAtEnd(9);
        cll.insertAtEnd(10);

        // Displaying the circular linked list
        System.out.println("Circular Linked List after insertion at the end:");
        cll.printList();

        cll.insertAtPosition(5, 5); // Insert at the beginning

        // Displaying the circular linked list
        System.out.println("Circular Linked List after insertion at given positions:");
        cll.printList();
    }
}