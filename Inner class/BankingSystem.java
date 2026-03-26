import java.util.Scanner;

public class BankingSystem 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) 
		{
            System.out.println("===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(name, accNo, balance);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();

                    BankAccount acc = bank.searchAccount(accNo);

                    if (acc != null) 
					{
                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();

                        BankAccount.Transaction t = acc.new Transaction();
                        t.deposit(amount);
                    } 
					else 
					{
                        System.out.println("Account not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null)
						{
                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();

                        BankAccount.Transaction t = acc.new Transaction();
                        t.withdraw(amount);
                    } 
					else 
					{
                        System.out.println("Account not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null) 
					{
                        acc.display();
                    } 
					else 
					{
                        System.out.println("Account not found");
                    }
                    break;

                case 5:
                    bank.displayAll();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}