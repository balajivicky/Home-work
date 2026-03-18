
class CircularList 
{

    Node head, tail;

    // INSERT AT BEGINNING
    void insertBegin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head; // circle
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // maintain circle
        }
    }

    // INSERT AT END
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circle
        }
    }

    // DELETE FROM BEGINNING
    void deleteBegin() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head; // maintain circle
        }
    }

    // DELETE FROM END
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;

            // go to node before tail
            while (temp.next != tail) {
                temp = temp.next;
            }

            tail = temp;
            tail.next = head; // maintain circle
        }
    }

    // DISPLAY
    void display() {
        if (head == null) return;

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        CircularList list = new CircularList();

        // INSERTIONS
        list.insertBegin(20);
        list.insertBegin(10);
        list.insertEnd(30);
        list.insertEnd(40);

        // DISPLAY
        System.out.println("Circular Linked List:");
        list.display();

        // DELETE BEGIN
        list.deleteBegin();
        System.out.println("After Deleting from Beginning:");
        list.display();

        // DELETE END
        list.deleteEnd();
        System.out.println("After Deleting from End:");
        list.display();
    }
}