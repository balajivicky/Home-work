package studentcrud;

import java.sql.*;
import java.util.Scanner;

public class StudentRecord 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        try 
        {

            Class.forName("org.postgresql.Driver");
           

            Connection conn = DriverManager.getConnection
        (
                   "jdbc:postgresql://localhost:5432/studentdb",
                    "postgres",
                    "1234"
            );

            int choice;

            do 
            {

                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                System.out.print("Enter Choice: ");
                choice = sc.nextInt();

                switch (choice) 
                {

                    case 1:

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        PreparedStatement ps1 = conn.prepareStatement
                        (
                                "insert into students values(?,?,?)"
                        );

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setInt(3, age);

                        ps1.executeUpdate();

                        System.out.println("Record Inserted");

                        break;

                    case 2:

                        PreparedStatement ps2 = conn.prepareStatement
                        (
                                "select * from students"
                        );

                        ResultSet rs = ps2.executeQuery();

                        while (rs.next()) 
                        {

                            System.out.println
                            (
                                    rs.getInt(1) + " "
                                    + rs.getString(2) + " "
                                    + rs.getInt(3)
                            );
                        }

                        break;

                    case 3:

                        System.out.print("Enter ID to Update: ");
                        int uid = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String uname = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        int uage = sc.nextInt();

                        PreparedStatement ps3 = conn.prepareStatement(
                                "update students set name=?, age=? where id=?"
                        );

                        ps3.setString(1, uname);
                        ps3.setInt(2, uage);
                        ps3.setInt(3, uid);

                        ps3.executeUpdate();

                        System.out.println("Record Updated");

                        break;

                    case 4:

                        System.out.print("Enter ID to Delete: ");
                        int did = sc.nextInt();

                        PreparedStatement ps4 = conn.prepareStatement(
                                "delete from students where id=?"
                        );

                        ps4.setInt(1, did);

                        ps4.executeUpdate();

                        System.out.println("Record Deleted");

                        break;

                    case 5:

                        System.out.println("Program Ended");

                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } while (choice != 5);

            conn.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
