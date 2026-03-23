import java.util.Scanner;
public class Static 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Student 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 1 Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Tuition Fee: ");
        double fee1 = sc.nextDouble();

        System.out.println();

       
        System.out.print("Enter Student 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 2 Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Tuition Fee: ");
        double fee2 = sc.nextDouble();

        System.out.println();

       
        Student s1 = new Student(id1, name1, fee1);
        Student s2 = new Student(id2, name2, fee2);

       
        System.out.println("College Name: " + Student.collegeName);
        System.out.println();

        
        s1.displayDetails();
        s2.displayDetails();

        Student.displayStudentCount();

        sc.close();
    }
}