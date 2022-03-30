import java.util.Scanner;
class CheckVowel
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the alphabet ");
		//int n1=s.nextInt();
		String alphabet=s.nextLine();
		switch(alphabet)
		{
			/*case 1: 
			if (alphabet=="a"||"A"||"e"||"E"||"i"||"I"||"o"||"O"||"u"||"U")
			System.out.println("Its a vowel");
			break;
			case 2:
			System.out.println("Its a consonant");
			break;
			default:
			System.out.println("Invalide");
			break;*/
			
			case "a"||"A":
			System.out.println("Its a vowel");
			break;
			case "e":
			System.out.println("Its a vowel");
			break;
			
			case "i":
			System.out.println("Its a vowel");
			break;
			case "o":
			System.out.println("Its a vowel");
			break;
			case "u":
			System.out.println("Its a vowel");
			break;
			default :
			
			System.out.println("Its a not vowel");
			break;
		}
	}
}