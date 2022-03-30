import java.util.Scanner;
class CheckEvenOrOdd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n1=s.nextInt();
		if(n1%2!=0)
		{
			System.out.println(" Sorry! its a odd number");
		}
		else 
		{
			System.out.println(" Its an even number ");
		}
		
		
	}
}