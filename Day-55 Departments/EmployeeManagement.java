import java.util.Scanner;

public class EmployeeManagement 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100]; 
        int count = 0; 

        while (true) 
		{
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    employees[count] = new Employee(id, name, dept);
                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (count == 0) 
					{
                        System.out.println("No employees found.");
                    } 
					else 
					{
                        System.out.println("\nEmployee List:");
                        for (int i = 0; i < count; i++) 
						{
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (employees[i].id == searchId)
						{
                            System.out.println("Employee Found:");
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println(" Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}