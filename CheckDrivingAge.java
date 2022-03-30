import java.util.Scanner;
class CheckDrivingAge
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age ");
		int n1=s.nextInt();
		if(n1<16)
		{
			System.out.println(" Sorry! wait for few more years ");
		}
		else if(n1>=16 && n1<18)
		{
			System.out.println(" ready for two wheeler ");
		}
		else if(n1>=18)
		{
			System.out.println("you are eligible for drivng licence");
		}
		
	}
}