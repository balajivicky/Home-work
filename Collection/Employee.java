import java.util.*;

class Employee 
{
    int id;
    String name;
    String department;
    double basicSalary;

    Employee(int id, String name, String department, double basicSalary) 
	{
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary()
	{
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;

        return basicSalary + hra + da - pf;
    }

    void display()
	{
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("----------------------");
    }
}
