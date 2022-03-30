import java.util.Scanner;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=s.nextInt();
		int remainder=0;
		int reverse=0;
		/* while(number!=0)
		{
			remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10; 
		} */
		 for(int i=0;number!=0;i++)
		{
			remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;
		    
		}
		System.out.println("The reverse of the given number is: " + reverse);  
	}
}