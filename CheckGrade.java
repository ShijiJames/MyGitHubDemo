import java.util.Scanner;
class CheckGrade
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mark ");
		//int n1=s.nextInt();
		float n1=s.nextFloat();

		if(n1<40)
		{
			System.out.println(n1 +"  --> Fail");
		}
		else if(n1>40 && n1<=60.5)
		{
			System.out.println(n1 +" -->Grade D");
		}
		else if(n1>60.5 && n1<=70)
		{
			System.out.println(n1 +" -->Grade C");
		}
		else if(n1>70 && n1<=80)
		{
			System.out.println(n1 +" -->Grade B");
		}
		else if(n1>80 && n1<=100)
		{
			System.out.println(n1 +" -->Grade A");
		}
	}
}