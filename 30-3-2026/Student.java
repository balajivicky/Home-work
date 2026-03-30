package students;

import java.util.Scanner;

class Student 
{
    String studentName;

    Student(String name) 
    {
        this.studentName = name;
    }

    class Marks 
    {
        String sub1, sub2, sub3;
        int m1, m2, m3;
        int total;
        double average;

        void getData(Scanner sc) 
        {
            System.out.println("Enter Subject 1 name:");
            sub1 = sc.next();

            System.out.println("Enter Subject 2 name:");
            sub2 = sc.next();

            System.out.println("Enter Subject 3 name:");
            sub3 = sc.next();

            System.out.println("Enter marks for " + sub1 + ":");
            m1 = sc.nextInt();

            System.out.println("Enter marks for " + sub2 + ":");
            m2 = sc.nextInt();

            System.out.println("Enter marks for " + sub3 + ":");
            m3 = sc.nextInt();
        }

        void calculate() 
        {
            total = m1 + m2 + m3;
            average = total / 3.0;
        }

        void display() 
        {
            System.out.println("--- Student Report ---");
            System.out.println("Name: " + studentName);

            System.out.println(sub1 + ": " + m1);
            System.out.println(sub2 + ": " + m2);
            System.out.println(sub3 + ": " + m3);

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        }
    }
}