import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the fibonacci series:");
		int len=s.nextInt();
		int i=0;
		int f1=0;int f2=1; int f3=0;
		while(i<=len)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			i=i++;
		}
		
	}
}