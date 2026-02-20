import java.util.Scanner;

class ExamScoreAnalyzer
{
    int scores[] = new int[10]; 
    int count = 0;             

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ExamScoreAnalyzer obj = new ExamScoreAnalyzer();

        int choice;

        do
        {
            System.out.println("--- Exam Score Analyzer ---");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.addScore(sc);
                    break;

                case 2:
                    obj.displayScores();
                    break;

                case 3:
                    obj.countPass();
                    break;

                case 4:
                    obj.countFail();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 5);
    }

    void addScore(Scanner sc)
    {
        if(count < scores.length)
        {
            System.out.print("Enter exam score: ");
            scores[count] = sc.nextInt();
            count++;
            System.out.println("Score added");
        }
        else
        {
            System.out.println("Score list full");
        }
    }

    void displayScores()
    {
        if(count == 0)
        {
            System.out.println("No scores available");
            return;
        }

        System.out.println("Exam Scores:");
        for(int i = 0; i < count; i++)
        {
            System.out.println(scores[i]);
        }
    }

    void countPass()
    {
        int passCount = 0;

        for(int i = 0; i < count; i++)
        {
            if(scores[i] >= 35)
            {
                passCount++;
            }
        }

        System.out.println("Pass count: " + passCount);
    }

    void countFail()
    {
        int failCount = 0;

        for(int i = 0; i < count; i++)
        {
            if(scores[i] < 35)
            {
                failCount++;
            }
        }

        System.out.println("Fail count: " + failCount);
    }
}
