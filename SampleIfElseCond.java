import java.util.Scanner;
class SampleIfElseCond
{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your age");
	int n1=s.nextInt();
	if(n1<10)
	{
		System.out.println("Child");
	}
	else if(n1>50)
	{
		System.out.println("Senior citizen");
	}
	else{
			System.out.println("Adult");
	}
	
}
}