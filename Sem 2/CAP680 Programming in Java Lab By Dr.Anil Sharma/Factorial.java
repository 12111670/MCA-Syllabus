//program how to find factorial number.
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number,factorial=1,ref;
		number = sc.nextInt();
		ref=number;
		
		while(number>0)
		{
			factorial=factorial*number;
			number--;
		}
		System.out.println("factorial of "+ref+" is "+factorial);
	}
}