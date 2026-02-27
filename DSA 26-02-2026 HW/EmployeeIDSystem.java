import java.util.Scanner;

class EmployeeIDSystem 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[] empIds = new int[100]; 
        int count = 0;               

        while (true) 
		{
            System.out.println("-------Menu-------");
			
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    empIds[count] = id; 
                    count++;
                    System.out.println("Employee ID added.");
                    break;

                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    int index = -1;

                    for (int i = 0; i < count; i++) {
                        if (empIds[i] == removeId) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Employee ID not found.");
                    } else {
                        for (int i = index; i < count - 1; i++) {
                            empIds[i] = empIds[i + 1];
                        }
                        count--;
                        System.out.println("Employee ID removed.");
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No employee IDs available.");
                    } else {
                        System.out.println("\nEmployee IDs:");
                        for (int i = 0; i < count; i++) {
                            System.out.print(empIds[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}