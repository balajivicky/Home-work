import java.util.Scanner;

class BankManagementSystem
{
    double balance = 0; 

    void deposit(Scanner sc)
    {
        System.out.println("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposit successful");
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(Scanner sc)
    {
        System.out.println("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println("Invalid withdrawal amount");
        }
    }

    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
		 
		 System.out.println("---ICICI BANK---");
		 
		 System.out.println("Enter your Account number");
		 long accnum = sc.nextLong();

        if(accnum == 1234567)
        {
            System.out.println("welcome Sir");
        
        BankManagementSystem bank = new BankManagementSystem();
        int choice;
		
	     do
        {
            System.out.println("----- BANK MENU -----");
			
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
				case 1:
                    bank.deposit(sc);
                    break;

                case 2:
                    bank.withdraw(sc);
                    break;

                case 3:
                    bank.displayBalance();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } 
		while(choice != 4);
		}
		else
        {
            System.out.println("Invalid account number");
        }
    }
}
