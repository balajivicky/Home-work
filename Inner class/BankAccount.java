import java.util.Scanner;

class BankAccount 
{
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) 
	{
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    class Transaction 
	{

        void deposit(double amount) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) 
		{
            if (balance >= amount) 
			{
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else 
			{
                System.out.println("Insufficient balance");
            }
        }
    }

    void display() 
	{
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}




