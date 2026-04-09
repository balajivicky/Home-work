import java.util.Scanner;


public class SmartLoginSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 3;
        int choice;

        do 
        {
            System.out.println("\n===== LOGIN MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    try 
                    {
                        if (attempts == 0) 
                        {
                            throw new AccountLockedException("Account Locked! Too many failed attempts.");
                        }

                        System.out.print("Enter Username: ");
                        String username = sc.next();

                        System.out.print("Enter Password: ");
                        String password = sc.next();

                        if (username.equals(correctUsername) && password.equals(correctPassword)) 
                        {
                            System.out.println("Login Successful!");
                            attempts = 3;
                        } 
                        else 
                        {
                            attempts--;
                            System.out.println(" Invalid Credentials!");
                            System.out.println("Remaining Attempts: " + attempts);

                            if (attempts == 0) 
                            {
                                throw new AccountLockedException(" Account Locked! No attempts left.");
                            }
                        }

                    } 
                    catch (AccountLockedException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println(" Invalid Choice");
            }

        } while (choice != 2);

        sc.close();
    }
}