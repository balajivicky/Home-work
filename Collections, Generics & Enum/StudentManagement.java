public class StudentManagement 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) 
		{
            System.out.println("--- Student Management System ---");
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
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    boolean exists = false;
                    for (Student s : list) 
					{
                        if (s.rollNo == roll) 
						{
                            exists = true;
                            break;
                        }
                    }

                    if (exists) 
					{
                        System.out.println("Roll number already exists!");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(roll, name, age, course, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) 
					{
                        System.out.println("No students found.");
                    } 
					else 
					{
                        for (Student s : list)
						{
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student s : list) 
					{
                        if (s.rollNo == searchRoll) 
						{
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) 
					{
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to update marks: ");
                    int updateRoll = sc.nextInt();
                    boolean updated = false;

                    for (Student s : list) 
					{
                        if (s.rollNo == updateRoll) 
						{
                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextDouble();
                            System.out.println("Marks updated!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) 
					{
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean deleted = false;

                    Iterator<Student> it = list.iterator();

                    while (it.hasNext()) 
					{
                        Student s = it.next();
                        if (s.rollNo == deleteRoll) 
						{
                            it.remove();
                            System.out.println("Student deleted!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) 
					{
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}