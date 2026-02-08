class GradeCal
{
    public static void main(String[] args) 
	{

        int marks = 82;

        if ((marks >= 90) && (marks <= 100))
		{
            System.out.println("Grade : A");
        }
        else if ((marks >= 80) && (marks <= 89)) 
		{
            System.out.println("Grade : B");
        }
        else if ((marks >= 50) && (marks <= 79)) 
		{
            System.out.println("Grade : C");
        }
        else if ((marks >= 0) && (marks < 50)) 
		{
            System.out.println("Grade : Fail");
        }
        else 
		{
            System.out.println("Invalid Marks");
        }
    }
}