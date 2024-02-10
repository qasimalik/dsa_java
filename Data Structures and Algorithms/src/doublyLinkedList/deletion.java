package doublyLinkedList;

class delete{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void deleteByValue(int value){

        Node current = head;
        while(current != null && current.data == value){
            current = current.next;
        }
        if(current == null){
            System.out.println("Node with value " +  value + " not found");
            return;
        }

        if(current.prev != null){
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if(current.next != null){
            current.next.prev = current.prev;
        }
    }

    public void deleteByPosition(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        int count = 1;
        while(current != null && count < position){
            current = current.next;
            count++;
        }

        if(current == null){
            System.out.println("Position " + position + " is out of bound");
            return;
        }

        if(current.prev != null){
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if(current.next != null){
            current.next.prev = current.prev;
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
public class deletion{
    public static void main(String[] args) {
        delete dll = new delete();

        dll.insert(4);
        dll.insert(3);
        dll.insert(2);
        dll.insert(1);

        System.out.println("Doubly linked list after insertion: " );
        dll.printList();

        dll.deleteByValue(2);
        System.out.println("After deleting by value 2: ");
        dll.printList();

        dll.deleteByPosition(3);
        System.out.println("After deleting by position 3: ");
        dll.printList();
    }
}