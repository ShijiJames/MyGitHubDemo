//WRITE A PROGRAME TO CHECK WHETHER THE GIVEN NUBER IS ARMSTRONG /NOT
import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int remainder=num%10;
			sum=sum+(remainder*remainder*remainder);
			num=num/10;		
		}
		if(temp==sum)
		{
			System.out.println("The given number is a Armstrone number");
			
		}
		else
		{
			System.out.println("The given number is a NOT Armstrone number");
		}
	}
}