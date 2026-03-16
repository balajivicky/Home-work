class SinglyLinkedList 
{
    Node head;

    
    void insertBeginning(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    void insertMiddle(String data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

  
    void insertEnd(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

