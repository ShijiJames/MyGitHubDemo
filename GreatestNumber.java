import java.util.Scanner;
class GreatestNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1 +"is the greatest number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2 +"is the greatest number");
		}
		else if(n3>n2 && n3>n1)
		{
			System.out.println(n3 +"is the greatest number");
		}
	}
}