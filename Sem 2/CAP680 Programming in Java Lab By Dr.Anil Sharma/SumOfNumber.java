import java.utils.Scanner;
class CheckPrime
{
	int getSum(int n)
	{
	int sum=0;
		 
		 while(n>0)
		{
        
           sum = sum +(n % 10);
           n = n / 10;
        }
		
	    return sum;
    }
	
	
	int getProduct(int n)
    {
       int product = 1;
 
        while (n != 0)
       {
            product = product * (n % 10);
            n = n / 10;
       }
 
       return product;
    }
	
	
	void prime(int result);
	{
	 for(int i=2; i<result; i++)
        {
           if(result%i == 0)
           {
             count++;
             break;
           }
        }
        if(count==0)
           System.out.println("\nIt is a Prime Number.");
        else
           System.out.println("\nIt is not a Prime Number.");
	}
    	
		
	public static void main(Strings[] args)
	{
		 
		 int number;
		 Scanner sc =new Scanner(String.in);
		 System.out.println("Enter a number:");
		 number=sc.nextInt();
		 CheckPrime c = new CheckPrime();
		 int sResult = c.sum(number);//calling of sum function.
		 System.out.pirntln("Sum of "+number"is"+sResult");
		 c.prime(sResult);//calling of prime function.
		 int pResult = c.product(number);//calling of product function.
		 System.out.println("Product of "+number"is"+sProduct");
		 c.prime(pResult);//calling of prime function.
		 
	}	 
		
}		