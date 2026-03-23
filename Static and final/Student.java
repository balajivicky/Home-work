import java.util.Scanner;

class Student 
{

    int studentId;
    String studentName;
    double tuitionFee;

    static String collegeName = "Magizhchi Arts and Science College";
    static int studentCount = 0;

    final double ADMISSION_FEE = 5000;

    Student(int studentId, String studentName, double tuitionFee) 
	{
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
        studentCount++;
    }

    double calculateTotalFee()
	{
        return tuitionFee + ADMISSION_FEE;
    }

    void displayDetails() 
	{
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Fee: " + calculateTotalFee());
        System.out.println();
    }

    static void displayStudentCount() 
	{
        System.out.println("Total Students: " + studentCount);
    }
}

