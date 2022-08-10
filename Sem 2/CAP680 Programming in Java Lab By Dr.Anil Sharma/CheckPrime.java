import java.util.Scanner;
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
	
	
	 static void getPrime(int result)
	{
		int count=0;
	    for(int i=2; i<result; i++)
        {
           if(result%i == 0)
           {
             count++;
             break;
           }
        }
        if(count==0)
           System.out.println("It is a Prime Number.\n");
        else
           System.out.println("\nIt is not a Prime Number.\n");
	}
    	
		
	public static void main(String[] args)
	{
		 
		 int number;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter a number:");
		 number=sc.nextInt();
		 //creating an object.
		 CheckPrime c = new CheckPrime();
		 //calling of non static getSum() function.
		 int sResult = c.getSum(number);
		 System.out.println("Sum of " + number + " is " + sResult);
		 //calling of static getPrime() function.
		 getPrime(sResult);
		 //calling of non static getProduct function.
		 int pResult = c.getProduct(number);
		 System.out.println("Product of " + number + " is " +pResult);
		 //Again calling of static getPrime() function.
		 getPrime(pResult);
		 
	}	 
		
}		