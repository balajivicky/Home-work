import java.util.Scanner;
public class ATMSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double balance = 10000; 
        int choice;

        do 
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    try 
                    {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();

                        if (amount > balance) 
                        {
                            throw new InsufficientBalanceException("Insufficient Balance!");
                        }

                        balance -= amount;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: " + balance);
                    } 
                    catch (InsufficientBalanceException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 3:
                    System.out.println(" Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}