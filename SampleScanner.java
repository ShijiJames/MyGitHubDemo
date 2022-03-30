import java.util.Scanner;
class SampleScanner
{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your first number");
	int n1=s.nextInt();
	System.out.println("Enter your second number");
	int n2=s.nextInt();
	int n3= n1+n2;
	System.out.println("Sum = "+n3);

}
}