import java.util.Scanner;
public class PrimeNumber1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number,ref,flag=0;
		number = sc.nextInt();
		
		if(number==0||number==1)
			System.out.println("Number is not prime");
		else
		{
			for(int i=2; i<=number/2; i++)
			{
				if(number%i==0)
				{
					System.out.println("Number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Number is prime");
		}
	}
}