class LetterDisplay 
{
    public static void main(String[] args) 
	{

        String text = "HAI" +
                      "HAI SIR HOW CAN I HELP YOU" +
                      "CAN YOU TELL ME ABOUT JAVA" +
                      "SURE, JAVA IS AN PROGRAMMING" +
                      "LANGUAGE WHICH IS USED FOR DEVELOP" +
                      "APPLICATIONS WITH PLATFORM\n" +
                      "INDEPENDENT";

        for (int i = 0; i < text.length(); i++)
			{
            System.out.print(text.charAt(i)); 

            try 
			{
                Thread.sleep(300); 
            } 
			catch (InterruptedException e) 
			{
                System.out.println(e);
            }
        }
    }
}