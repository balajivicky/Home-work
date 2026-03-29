import java.util.*;

public class MainEmployee 
{

    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addEmployee() 
	{
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : list) 
		{
            if (e.id == id) 
			{
                System.out.println("Employee ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Department: ");
        String dept = sc.next();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        list.add(new Employee(id, name, dept, salary));
        System.out.println("Employee added successfully!");
    }

    static void viewEmployees() 
	{
        if (list.isEmpty()) 
		{
            System.out.println("No employees found!");
            return;
        }

        for (Employee e : list) 
		{
            e.display();
        }
    }

    static Employee searchEmployee(int id) 
	{
        for (Employee e : list) 
		{
            if (e.id == id) 
			{
                return e;
            }
        }
        return null;
    }

    static void updateSalary() 
	{
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = searchEmployee(id);

        if (e != null) 
		{
            System.out.print("Enter New Basic Salary: ");
            e.basicSalary = sc.nextDouble();
            System.out.println("Salary updated!");
        } 
		else 
		{
            System.out.println("Employee not found!");
        }
    }

    static void calculateSalary() 
	{
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = searchEmployee(id);

        if (e != null) 
		{
            double netSalary = e.calculateNetSalary();
            System.out.println("Net Salary: " + netSalary);
        } 
		else 
		{
            System.out.println("Employee not found!");
        }
    }

    static void deleteEmployee() 
	{
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = searchEmployee(id);

        if (e != null) 
		{
            list.remove(e);
            System.out.println("Employee deleted!");
        } 
		else 
		{
            System.out.println("Employee not found!");
        }
    }

    public static void main(String[] args) 
	{

        while (true) 
		{
            System.out.println("===== EMPLOYEE MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    Employee e = searchEmployee(id);

                    if (e != null) 
					{
                        e.display();
                    }
					else 
					{
                        System.out.println("Employee not found!");
                    }
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    calculateSalary();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}