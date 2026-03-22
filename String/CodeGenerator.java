import java.util.Scanner;

public class CodeGenerator 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();

        String namePart = name.substring(0, 3).toUpperCase();
        String deptPart = dept.substring(0, 3).toUpperCase();

        StringBuilder code = new StringBuilder();
        code.append(namePart)
            .append("-")
            .append(deptPart)
            .append("-")
            .append(year);

        System.out.println("Generated Code: " + code);
    }
}