// program to find ASCII VALUE.
import java.util.Scanner;
public class ASCII
{
	public static void main(String []args)
	{
		System.out.println("Enter ASCII range from lower to upper:");
		Scanner sc = new Scanner(System.in);
		int lower = sc.nextInt();
		int upper =sc.nextInt();
		
		//System.out.println("ASCII value of "+ch+" is "+asciivlue);
		for(int i=lower; i<=upper; i++)
		{
			System.out.println("ASCII value of "+(char)i+" is "+i);
		}

	}
}	