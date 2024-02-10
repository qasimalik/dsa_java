package circularLinkedList;

class deleteNode{
    private Node head;
    public deleteNode(){
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
    public void deleteFirst(){
        if(head == null) {
            System.out.println("Nothing to delete here");
            return;
        }else if(head.next == head){
            head = null;
        } else {
            Node ptr = head;
            while(ptr.next != head)
                ptr = ptr.next;
            ptr.next = head.next;
            head = ptr.next;
            System.out.println("\nNode Deleted\n");
        }
    }

    public void deleteNode(int key){
        if(head == null){
            System.out.println("Cannot delete. Its empty");
            return;
        }

        Node curr = head;
        Node prev = null;
        do{
            if(curr.data == key){
                if(prev == null){
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr!=head);
        System.out.println("Node with the key " + key + " not found");
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

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node prev = null;

        do{
            prev = current;
            current = current.next;
        } while (current.next != head);

        prev.next = head;
    }

}
public class delete {

    public static void main(String[] args) {
        deleteNode dn = new deleteNode();

        dn.insert(5);
        dn.insert(4);
        dn.insert(3);
        dn.insert(2);
        dn.insert(1);

        System.out.println("Circular Linked list after insertion: ");
        dn.printList();

        dn.deleteNode(4);
        System.out.println("Circular Linked list after deletion: ");
        dn.printList();

        dn.deleteAtEnd();
        System.out.println("Circular Linked list after deleting the end: ");
        dn.printList();
    }
}
