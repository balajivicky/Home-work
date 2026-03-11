public class EmployeeManagement 
{
    public static void main(String[] args) 
	{
        System.out.println("Employee Management System");
        System.out.println("--------------------------");

        Employee e1 = new Employee("Alice", 50000);
        Manager m1 = new Manager("Bob", 80000, "IT");

        e1.displayInfo();
        m1.displayInfo();
    }
}