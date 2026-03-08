import java.util.Scanner;

public class LibrarySystem
{
    public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);
        
        Book[] books = new Book[100];
        int count = 0;

        while (true) 
		{
            System.out.println("------Library Menu-----");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, title, author);
                    count++;

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (count == 0) 
					{
                        System.out.println("No books in library.");
                    } 
					else 
					{
                        for (int i = 0; i < count; i++) 
						{
                            books[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();

                    for (int i = 0; i < count; i++) 
					{
                        if (books[i].bookId == borrowId) 
						{
                            books[i].borrowBook();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    for (int i = 0; i < count; i++) 
					{
                        if (books[i].bookId == returnId) 
						{
                            books[i].returnBook();
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}