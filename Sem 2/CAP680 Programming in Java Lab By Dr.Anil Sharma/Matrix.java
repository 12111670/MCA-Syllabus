import java.util.Scanner;
class Matrix
{ 
   public static void main(String []args)
  {
     int row,column,sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows:");
     row = sc.nextInt();
     System.out.println("Enter the number of columns:");
     column = sc.nextInt();
     int matrix[][] = new int[row][column];
     System.out.println("Enter the elemetns of matrix:");
     for(int i=0;i < row;i++)
     {
         for(int j=0;j < column;j++)
         {  
             matrix[i][j] = sc.nextInt();
         }
      }
System.out.println("Entered Matrix is:");
     for(int i=0;i < row;i++)
     {
         for(int j=0;j < column;j++)
         {
             System.out.print( matrix[i][j]+" ");
          }
		  System.out.println("");

     }
     //System.out.println("");
     System.out.println("\nColumnwise sum of matrix is:");
     for(int j=0;j<column;)
     { 
        for(int i=0;i<row;i++)
        { 
             sum=sum+matrix[i][j];
        }
       System.out.println("Sum of " +(++j)+ " column is:" +sum );
     }

        
   }
}
     