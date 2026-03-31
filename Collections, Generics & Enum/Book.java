import java.util.*;

class Book 
{
    int id;
    String title;
    String author;
    String status;

    Book(int id, String title, String author) 
	{
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

    void display() 
	{
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }
}