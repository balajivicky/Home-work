import java.util.Scanner;

class PassByDemo 
{
    void increaseMarks(int marks) 
	{
        marks = marks + 10;
        System.out.println("Inside method: " + marks);
    }

    class Student 
	{
        int marks;
    }

    void updateStudentMarks(Student s) 
	{
        s.marks = s.marks + 10;
        System.out.println("Inside method: " + s.marks);
    }

    void changeName(String name) 
	{
        name = name + " Kumar";
        System.out.println("Inside method: " + name);
    }

    void modifyArray(int[] arr) 
	{
        arr[0] = 99;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        PassByDemo obj = new PassByDemo();

        while (true) 
		{
            System.out.println("---- MENU ----");
            System.out.println("1. Pass by Value – Increase Marks");
            System.out.println("2. Pass by Reference – Update Student Marks");
            System.out.println("3. Pass by Value – Change String");
            System.out.println("4. Pass by Reference – Modify Array");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    System.out.println("Before method call: " + marks);
                    obj.increaseMarks(marks);
                    System.out.println("After method call: " + marks);
                    break;

                case 2:
                    PassByDemo.Student st = obj.new Student();
                    System.out.print("Enter student marks: ");
                    st.marks = sc.nextInt();
                    System.out.println("Before method call: " + st.marks);
                    obj.updateStudentMarks(st);
                    System.out.println("After method call: " + st.marks);
                    break;

                case 3:
                    sc.nextLine(); 
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Before method: " + name);
                    obj.changeName(name);
                    System.out.println("After method: " + name);
                    break;

                case 4:
                    int[] arr = new int[3];
                    System.out.print("Enter array elements: ");
                    for (int i = 0; i < 3; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.print("Before method: ");
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();

                    obj.modifyArray(arr);

                    System.out.print("After method: ");
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Program Exited Successfully");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}