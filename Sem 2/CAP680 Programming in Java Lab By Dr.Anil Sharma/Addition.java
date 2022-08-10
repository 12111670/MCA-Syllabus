import java.util.Scanner;
public class Addition
{
   public static void main(String []args)
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter two numbers:");
      int a=ob.nextInt();
      int b=ob.nextInt();
      int s=a+b;
      System.out.println("Sum of "+a+" and "+b+" = "+s);
   }
}