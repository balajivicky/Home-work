import java.util.Scanner;

class TypeConversionMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- TYPE CONVERSION MENU -----");
        System.out.println("1. int to double");
        System.out.println("2. double to int");
        System.out.println("3. char to int");
        System.out.println("4. int to char");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.print("Enter integer value: ");
                int i = sc.nextInt();
                double d1 = i;  
                System.out.println("int to double: " + d1);
                break;

            case 2:
                System.out.print("Enter double value: ");
                double d = sc.nextDouble();
                int i2 = (int) d;  
                System.out.println("double to int: " + i2);
                break;

            case 3:
                System.out.print("Enter a character: ");
                char ch = sc.next().charAt(0);
                int ascii = ch;  
                System.out.println("char to int (ASCII): " + ascii);
                break;

            case 4:
                System.out.print("Enter integer value: ");
                int num = sc.nextInt();
                char c = (char) num; 
                System.out.println("int to char: " + c);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}