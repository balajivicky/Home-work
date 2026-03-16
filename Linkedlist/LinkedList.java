class LinkedList 
{
    Node head;
 
    void insertBeginning(int data) 
	{
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) 
	{
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) 
		{
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void insertMiddle(int data, int position) 
	{

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void display() 
	{
        Node temp = head;

        while (temp != null) 
		{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) 
	{

        LinkedList list = new LinkedList();

        list.insertBeginning(30);
        list.insertBeginning(20);
        list.insertBeginning(10);

        list.insertMiddle(25, 3);

        list.insertEnd(40);

        list.display();
    }
}