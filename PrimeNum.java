//WRITE A PROGRAM TO FIND WHETHER THE GIVEN NUMBER IS PRIME OR NOT

import java.util.Scanner;
class PrimeNum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter number:");
		int num=s.nextInt();
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime =false;
				break;
			}
		}
		System.out.println(prime);
	}
}
