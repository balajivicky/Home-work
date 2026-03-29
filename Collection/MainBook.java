import java.util.*;

public class MainBook 
{

    static ArrayList<Book> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addBook() 
	{
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : list) 
		{
            if (b.id == id) 
			{
                System.out.println("Book ID already exists!");
                return;
            }
        }

        System.out.print("Enter Title: ");
        String title = sc.next();

        System.out.print("Enter Author: ");
        String author = sc.next();

        list.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    static void viewBooks() 
	{
        if (list.isEmpty()) 
		{
            System.out.println("No books found!");
            return;
        }

        for (Book b : list) 
		{
            b.display();
        }
    }

    static Book searchBook(int id) 
	{
        for (Book b : list) 
		{
            if (b.id == id) 
			{
                return b;
            }
        }
        return null;
    }

    static void issueBook() 
	{
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = searchBook(id);

        if (b != null) 
		{
            if (b.status.equals("Issued")) 
			{
                System.out.println("Book already issued!");
            } else 
			{
                b.status = "Issued";
                System.out.println("Book issued successfully!");
            }
        }
		else 
		{
            System.out.println("Book not found!");
        }
    }

    static void returnBook() 
	{
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = searchBook(id);

        if (b != null) 
		{
            if (b.status.equals("Available")) 
			{
                System.out.println("Book already available!");
            } 
			else 
			{
                b.status = "Available";
                System.out.println("Book returned successfully!");
            }
        } 
		else 
		{
            System.out.println("Book not found!");
        }
    }

    static void deleteBook() 
	{
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = searchBook(id);

        if (b != null)
			{
            list.remove(b);
            System.out.println("Book deleted!");
        } 
		else 
		{
            System.out.println("Book not found!");
        }
    }

    public static void main(String[] args) 
	{

        while (true) 
		{
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice)
			{
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    Book b = searchBook(id);

                    if (b != null) 
					{
                        b.display();
                    } 
					else 
					{
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}