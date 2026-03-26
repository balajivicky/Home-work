import java.util.Scanner;

class Bank 
{
    Node head = null;

    void createAccount(String name, int accNo, double balance) 
	{
        BankAccount acc = new BankAccount(name, accNo, balance);
        Node newNode = new Node(acc);

        if (head == null) 
		{
            head = newNode;
        } 
		else 
		{
            Node temp = head;
            while (temp.next != null) 
			{
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("Account created!");
    }

    BankAccount searchAccount(int accNo) 
	{
        Node temp = head;

        while (temp != null) 
		{
            if (temp.data.accountNumber == accNo) 
			{
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    void displayAll() 
	{
        Node temp = head;

        if (temp == null) 
		{
            System.out.println("No accounts found");
            return;
        }

        while (temp != null) 
		{
            temp.data.display();
            System.out.println("-------------------");
            temp = temp.next;
        }
    }
}
