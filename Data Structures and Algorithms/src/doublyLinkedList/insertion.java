package doublyLinkedList;

class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class doubleLinkedList{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAfterNode(int data, Node prevNode){
        if(prevNode == null){
            System.out.println("Previous Node can not be empty");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;

        if(prevNode!=null){
            prevNode.next.prev = newNode;
        }
        prevNode.next = newNode;
    }

    public void insertBeforeNode(int data, Node nextNode){
        if(nextNode == null){
            System.out.println("Next Node can not be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.prev = nextNode.prev;
        newNode.next = nextNode;

        if(nextNode.prev != null){
            nextNode.prev.next = newNode;
        }

        nextNode.prev = newNode;

        if(nextNode == head){
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node current = head;

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void reverse(){
        Node current = head;
        Node temp = null;

        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
    }

    public void printList(){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
public class insertion {
    public static void main(String[] args) {
        doubleLinkedList dll = new doubleLinkedList();

        dll.insert(3);
        dll.insert(2);
        dll.insert(1);

        System.out.println("Doubly linked list after insertion in the beginning: " );
        dll.printList();

        dll.insertAtEnd(5);
        dll.insertAtEnd(4);
        System.out.println("Doublt Linked list after insertion at the end: ");
        dll.printList();

//        dll.head = new Node(1);
//        Node secondNode = new Node(2);
//        Node thirdNode = new Node(3);
//        dll.head.next = secondNode;
//        secondNode.prev = dll.head;
//        secondNode.next = thirdNode;
//        thirdNode.prev = secondNode;
//
//        // Adding a node before the second node
//        dll.insertAfterNode(4, secondNode);
//
//        // Displaying the list
//        Node current = dll.head;
//        System.out.println("Doubly Linked List:");
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }

//        dll.insertBeforeNode(22, secondNode);
//        System.out.println("Doubly Linked List:");
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
    }
}
