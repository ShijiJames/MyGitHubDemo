import java.util.Scanner;
class SwitchCond
{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter color");
	String color=s.nextLine();
	switch(color)
	{
		case "green":
		System.out.println("move");
		break;
		case "yellow":
		System.out.println("ready to move");
		break;
		case "red":
		System.out.println("stop");
		break;
		default:
		System.out.println("Invalid");
		break;
	}
		
}
}