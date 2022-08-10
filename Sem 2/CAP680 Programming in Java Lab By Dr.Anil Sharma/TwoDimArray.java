import java.util.Scanner;
class TwoDimArray
{
	
	  public static void main(String []args)
	  {   
		  // Dynamically Array declation.
		  int array1[][] = new int[3][3];
		  int array2[][] = new int[3][3];
		  Scanner sc = new Scanner(System.in);
		  //This for nested loop entering elements in array1.
		  for(int i=0; i<3; i++)
		  {
			  for(int j=0; j<3; j++)
			  {	  
		          System.out.println("\nEnter the elements in (3 x 3) twoDarray1:");
		          array1[i][j]  = sc.nextInt();//taking input into array1.
			  }
		  }
		  //This loop coping array1 elements to array2.
		  for(int i=0; i<3; i++)
		  {
			  
			  for(int j=0; j<3; j++)
			  {
				  array2[i][j]=array1[i][j];
			  }
		  }
		  
         System.out.println("\nCopied TwoDarray2 elements is:"); 		  
		  //This loop showing array2 elements. 
		  for(int i=0; i<3; i++)
		  {
            for(int j=0; j<3; j++)
			{
                System.out.print("  "+array2[i][j]);
			}
           System.out.println();
		  }
      }
}	  