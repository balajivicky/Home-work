import java.util.Scanner;

class Node 
{
    BankAccount data;
    Node next;

    Node(BankAccount data) 
	{
        this.data = data;
        this.next = null;
    }
}