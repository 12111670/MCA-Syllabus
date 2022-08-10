import java.lang.*;
import java.util.*;
class New 
{ 
     final strictfp static public void main(String... args)
   {
      String name;
      
      Scanner sc= new Scanner(System.in);
      
      System.out.println("May I know your name please:");
     name = sc.nextLine();

      System.out.println("Welcome "+name);
   }
};