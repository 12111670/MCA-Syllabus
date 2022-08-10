//Program to check number is Armstrong or not.
import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int number,temp,digits=0,last=0,sum=0;
		number = sc.nextInt();
		temp = number;
		
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		
		temp=number;
		
		while(temp>0)
		{
		last=temp%10;
		sum+=(Math.pow(last,digits));
		temp=temp/10;
		}
		if(number==sum)
			System.out.print("Number is Armstrong.");
		else
			System.out.print("Number is not Armstrong.");
	}	
}
		