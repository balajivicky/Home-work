
class DoublyList 
{

    Node head, tail;

    // INSERT AT BEGINNING
    void insertBegin(int data) 
	{
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // INSERT AT END
    void insertEnd(int data) 
	{
        Node newNode = new Node(data);

        if (head == null) 
		{
            head = tail = newNode;
        } else 
		{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // DELETE FROM BEGINNING
    void deleteBegin() 
	{
        if (head == null) 
		{
            System.out.println("List is empty");
        } else if (head == tail) 
		{
            head = tail = null;
        } else 
		{
            head = head.next;
            head.prev = null;
        }
    }

    // DELETE FROM END
    void deleteEnd() 
	{
        if (head == null) 
		{
            System.out.println("List is empty");
        } else if (head == tail) 
		{
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // DISPLAY FORWARD
    void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // DISPLAY BACKWARD
    void displayBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyList list = new DoublyList();

        // INSERTIONS
        list.insertBegin(20);
        list.insertBegin(10);
        list.insertEnd(30);
        list.insertEnd(40);

        // DISPLAY
        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("Backward Display:");
        list.displayBackward();

        // DELETE BEGIN
        list.deleteBegin();
        System.out.println("After Deleting from Beginning:");
        list.displayForward();

        // DELETE END
        list.deleteEnd();
        System.out.println("After Deleting from End:");
        list.displayForward();
    }
}