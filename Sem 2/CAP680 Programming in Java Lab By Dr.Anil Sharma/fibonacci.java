// Fibonacci serie program
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a term:");
	   int number1=0,number2=1,temp,term;
	   term = sc.nextInt();
	   
	   System.out.print("Series is:"+number1+" "+number2);
	   
	   for(int i=3; i<=term; i++)
	   {
		   temp=number1+number2;
		   System.out.print(" "+temp);
		   number1=number2;
		   number2=temp;
	   }
	}
}