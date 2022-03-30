//WRITE A PROGRAM TO FIND all even and odd numbers from 10 to 20

import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
		/* System.out.println("Enter the length of numbers:");
		int length=s.nextInt(); */
		 int prime=0;
		 int odd=0;
		 System.out.println("prime numbers are");
		for(int i=10;i<20;i++)
		{
			
			if(i%2==0)
			{
				//prime =i;
				System.out.println(i);
				
			}
			
			   
		}
		System.out.println("odd numbers are");
		for(int j=10;j<20;j++)
		{
			
			if(j%2!=0)
			{
				//odd=j;
				System.out.println(j);
				
			}
			
			
		}
		
	}
}
