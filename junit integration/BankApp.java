import java.util.Scanner;

public class BankApp 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);

        while (true) 
		{
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try 
			{
                switch (choice) 
				{

                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        System.out.println("Deposit successful!");
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                        System.out.println("Withdrawal successful!");
                        break;

                    case 3:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } 
			catch (IllegalArgumentException e) 
			{
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}