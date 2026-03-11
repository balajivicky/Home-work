class Employee 
{
    String name;
    double salary;

    Employee(String name, double salary) 
	{
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() 
	{
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println();
    }
}