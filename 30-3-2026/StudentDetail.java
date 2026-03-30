package students;

import java.util.Scanner;

public class StudentDetail 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.next();

        Student s = new Student(name);

        Student.Marks m = s.new Marks();

        m.getData(sc);
        m.calculate();
        m.display();

    }
}
