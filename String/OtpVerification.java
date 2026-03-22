import java.util.Scanner;

public class OtpVerification 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        
        String originalOTP = "4589";

        System.out.print("Enter OTP: ");
        String userOTP = sc.nextLine();

       
        if (originalOTP.equals(userOTP)) 
		{
            System.out.println("OTP Verified Successfully");
        } 
		else 
		{
            System.out.println("Invalid OTP");
        }

        originalOTP.concat("123");
		
        System.out.println("After concat: " + originalOTP);
    }
}