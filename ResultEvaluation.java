import java.util.Scanner;

class ResultEvaluation 
{

    int sub1, sub2, sub3;
    int total;
    float percentage;

    Scanner sc = new Scanner(System.in);

    void inputMarks() 
	{
        System.out.print("Enter Subject 1 marks: ");
        sub1 = sc.nextInt();

        System.out.print("Enter Subject 2 marks: ");
        sub2 = sc.nextInt();

        System.out.print("Enter Subject 3 marks: ");
        sub3 = sc.nextInt();
    }

    void calculateTotal() 
	{
        total = sub1 + sub2 + sub3;
        System.out.println("Total Marks = " + total);
    }

    void calculatePercentage() 
	{
        percentage = total / 3.0f;
        System.out.println("Percentage = " + percentage);
    }

    void displayResult() 
	{
        if (percentage >= 40) 
		{
            System.out.println("Result: PASS");
        } else 
		{
            System.out.println("Result: FAIL");
        }
    }

    void displayGrade() 
	{
        if (percentage >= 75) 
		{
            System.out.println("Grade: A");
        } else if (percentage >= 60) 
		{
            System.out.println("Grade: B");
        } else if (percentage >= 40) 
		{
            System.out.println("Grade: C");
        } 
		else 
		{
            System.out.println("Grade: F");
        }
    }

    public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);
        ResultEvaluation obj = new ResultEvaluation();

        int choice;

        obj.inputMarks();

        do {
            System.out.println("----MENU----");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    obj.calculateTotal();
                    break;

                case 2:
                    obj.calculateTotal();
                    obj.calculatePercentage();
                    break;

                case 3:
                    obj.calculateTotal();
                    obj.calculatePercentage();
                    obj.displayResult();
                    break;

                case 4:
                    obj.calculateTotal();
                    obj.calculatePercentage();
                    obj.displayGrade();
                    break;

                case 5:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } 
		while (choice != 5);
    }
}