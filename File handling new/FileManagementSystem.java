import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManagementSystem 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        File file = new File("student.txt");

        int choice;

        do 
		{
            System.out.println("\n===== FILE MANAGEMENT SYSTEM =====");
            System.out.println("1. Write Data");
            System.out.println("2. Read Data");
            System.out.println("3. Append Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
			{

                case 1:
                    try 
					{
                        FileWriter writer = new FileWriter(file); // overwrite mode
                        System.out.print("Enter data to write: ");
                        String data = sc.nextLine();

                        writer.write(data);
                        writer.close();

                        System.out.println("Data written successfully (Overwritten).");
                    } 
					catch (IOException e) 
					{
                        System.out.println("Error writing to file.");
                    }
                    break;

                case 2:
                    if (!file.exists()) 
					{
                        System.out.println("File does not exist.");
                    } else 
					{
                        try 
						{
                            FileReader reader = new FileReader(file);
                            int ch;

                            System.out.println("\nFile Content:");
                            while ((ch = reader.read()) != -1) 
							{
                                System.out.print((char) ch);
                            }

                            reader.close();
                            System.out.println();
                        } catch (IOException e) 
						{
                            System.out.println("Error reading file.");
                        }
                    }
                    break;

                case 3:
                    try 
					{
                        FileWriter writer = new FileWriter(file, true); 
                        System.out.print("Enter data to append: ");
                        String data = sc.nextLine();

                        writer.write("\n" + data);
                        writer.close();

                        System.out.println("Data appended successfully.");
                    } 
					catch (IOException e) 
					{
                        System.out.println("Error appending to file.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } 
		while (choice != 4);

        sc.close();
    }
}