//program of palindrome number.
import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number,ref,sum=0,remainder;
		number = sc.nextInt();
		
		ref=number;
		
		while(number>0)
		{
			remainder=number%10;
			sum = (sum*10)+remainder;
			number=number/10;
		}
		if(ref==sum)
			System.out.println("Number is Palindrome.");
		else 
			System.out.println("Number is not palindrome.");
	}
}