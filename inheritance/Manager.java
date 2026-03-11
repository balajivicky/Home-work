class Manager extends Employee 
{
    String department;

    Manager(String name, double salary, String department) 
	{
        super(name, salary);
        this.department = department;
    }

    void displayInfo() 
	{
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Department: " + department);
    }
}