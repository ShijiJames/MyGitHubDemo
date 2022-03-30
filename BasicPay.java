import java.util.Scanner;

public class BasicPay
	{
	double basicpay=0.0d;
	double deduction=0.0d;
	double bonus=0.0d;
	public void basic()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the basic pay of the employee:");	
	    basicpay=input.nextDouble();
		System.out.println("Enter the deduction amount:");	
		deduction=input.nextDouble();
		System.out.println("Enter the bonus amount:");	
		bonus=input.nextDouble();
		System.out.println("Basic Pay :"+basicpay);	
		System.out.println("Deduction :"+deduction);	
		System.out.println("bonus :"+bonus);	

	}
}