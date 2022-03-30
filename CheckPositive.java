import java.util.Scanner;
class CheckPositive
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n1=s.nextInt();
		if(n1>=0)
		{
			System.out.println(" number is positive ");
		}
		else
		{
			System.out.println(" number is negative ");
		}
	}
}