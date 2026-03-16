public class LinkDsa
{
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertBeginning("Ravi");
        list.insertBeginning("Kumar");
        list.insertBeginning("Arun");
        list.insertMiddle("Vijay", 3);
        list.insertEnd("Ajay");

        list.display();
    }
}