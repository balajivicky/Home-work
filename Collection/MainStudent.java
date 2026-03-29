import java.util.*;


public class MainStudent 
{

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() 
	{
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        for (Student s : list) 
		{
            if (s.rollNo == roll) 
			{
                System.out.println("Roll number already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Course: ");
        String course = sc.next();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        list.add(new Student(roll, name, age, course, marks));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() 
	{
        if (list.isEmpty()) 
		{
            System.out.println("No students found!");
            return;
        }

        for (Student s : list) 
		{
            s.display();
        }
    }

    // 🔹 Search Student
    static Student searchStudent(int roll) 
	{
        for (Student s : list) 
		{
            if (s.rollNo == roll) 
			{
                return s;
            }
        }
        return null;
    }

    static void updateMarks() 
	{
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Student s = searchStudent(roll);

        if (s != null) 
		{
            System.out.print("Enter New Marks: ");
            s.marks = sc.nextDouble();
            System.out.println("Marks updated!");
        } 
		else 
		{
            System.out.println("Student not found!");
        }
    }

    static void deleteStudent() 
	{
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Student s = searchStudent(roll);

        if (s != null) 
		{
            list.remove(s);
            System.out.println("Student deleted!");
        } 
		else 
		{
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) 
	{

        while (true) 
		{
            System.out.println("===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    Student s = searchStudent(roll);

                    if (s != null) 
					{
                        s.display();
                    } else 
					{
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}