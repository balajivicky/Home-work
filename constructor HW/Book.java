import java.util.Scanner;

class Book 
{
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(int id, String t, String a) 
	{
        bookId = id;
        title = t;
        author = a;
        isAvailable = true;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("-----------------------");
    }

    void borrowBook() 
	{
        if (isAvailable) 
		{
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    void returnBook() 
	{
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
}
