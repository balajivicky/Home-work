import java.util.Scanner;

class DailyExpenseTracker
{
    int expenses[] = new int[10]; 
    int count = 0;                

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        DailyExpenseTracker obj = new DailyExpenseTracker();

        int choice;

        do
        {
            System.out.println("--- Daily Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.addExpense(sc);
                    break;

                case 2:
                    obj.viewExpenses();
                    break;

                case 3:
                    obj.calculateTotal();
                    break;

                case 4:
                    obj.findHighest();
                    break;

                case 5:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 5);
    }

    void addExpense(Scanner sc)
    {
        if(count < expenses.length)
        {
            System.out.print("Enter expense amount: ");
            expenses[count] = sc.nextInt();
            count++;
            System.out.println("Expense added successfully");
        }
        else
        {
            System.out.println("Expense list full");
        }
    }

    void viewExpenses()
    {
        if(count == 0)
        {
            System.out.println("No expenses added");
            return;
        }

        System.out.println("Expenses:");
        for(int i = 0; i < count; i++)
        {
            System.out.println(expenses[i]);
        }
    }

    void calculateTotal()
    {
        int total = 0;

        for(int i = 0; i < count; i++)
        {
            total = total + expenses[i];
        }

        System.out.println("Total Expense: " + total);
    }

    void findHighest()
    {
        if(count == 0)
        {
            System.out.println("No expenses added");
            return;
        }

        int max = expenses[0];

        for(int i = 1; i < count; i++)
        {
            if(expenses[i] > max)
            {
                max = expenses[i];
            }
        }

        System.out.println("Highest Expense: " + max);
    }
}
