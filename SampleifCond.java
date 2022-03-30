import java.util.Scanner;
class SampleifCond
{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your age");
	int n1=s.nextInt();
	if(n1>=18)
	{
		System.out.println("Eligible");
	}
	else
	{
		System.out.println(" not Eligible");
	}
	

}
}