import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioDataProgram 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        try 
		{
            File file = new File("biodata.txt");

            if (file.createNewFile()) 
			{
                System.out.println("File created: " + file.getName());
            } 
			else 
			{
                System.out.println("File already exists. Overwriting...");
            }

            FileWriter writer = new FileWriter(file);

            System.out.println("Enter Personal Details:");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Date of Birth: ");
            String dob = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            System.out.println("\nEnter Educational Details:");
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("College Name: ");
            String college = sc.nextLine();

            System.out.print("Percentage / CGPA: ");
            String cgpa = sc.nextLine();

            System.out.println("\nEnter Professional Details:");
            System.out.print("Skills (comma separated): ");
            String skills = sc.nextLine();

            System.out.print("Experience (in years): ");
            String experience = sc.nextLine();

            System.out.println("\nEnter Contact Details:");
            System.out.print("Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Email ID: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.println("\nEnter Family Details:");
            System.out.print("Father Name: ");
            String father = sc.nextLine();

            System.out.print("Mother Name: ");
            String mother = sc.nextLine();

            writer.write("=========== BIO DATA ===========\n");

            writer.write("👤 Personal Details\n");
            writer.write("Name : " + name + "\n");
            writer.write("Age : " + age + "\n");
            writer.write("Gender : " + gender + "\n");
            writer.write("DOB : " + dob + "\n");
            writer.write("Blood Group : " + bloodGroup + "\n\n");

            writer.write("🎓 Education\n");
            writer.write("Qualification : " + qualification + "\n");
            writer.write("College : " + college + "\n");
            writer.write("CGPA : " + cgpa + "\n\n");

            writer.write("💼 Skills\n");
            writer.write(skills + "\n\n");
            writer.write("Experience : " + experience + " Years\n\n");

            writer.write("📞 Contact\n");
            writer.write("Phone : " + phone + "\n");
            writer.write("Email : " + email + "\n");
            writer.write("Address : " + address + "\n\n");

            writer.write("👨‍👩‍👧 Family\n");
            writer.write("Father Name : " + father + "\n");
            writer.write("Mother Name : " + mother + "\n");

            writer.write("================================\n");

            writer.close();

            System.out.println("\n✅ Bio Data saved successfully in biodata.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sc.close();
    }
}