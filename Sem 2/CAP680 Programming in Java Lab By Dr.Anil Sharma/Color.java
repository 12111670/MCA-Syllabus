import java.util.Scanner;
class Colour
{
    	  
	public static void main(String args[])
	{ 
	 
		Scanner sc=new Scanner(System.in);
		//creating infinite loop.
		while(true)
		{
		    //To displaying colour code.

			System.out.println("\nColour value:1111");
			System.out.println("Colour value:0000");
			System.out.println("Colour value:0001");
			System.out.println("Colour value:1011");
			System.out.println("Colour value:1110");
			System.out.println("Colour value:0111");
			System.out.println("Colour value:1101");
			System.out.println("For exit to the loop:8888");//For exiting to the loop.
			
			System.out.print("\nEnter a colour value (only 4 digits) :#");
		    int value=sc.nextInt();     
			
			switch(value)//creating switch cases.
            {
                case 1111:
			
                     System.out.println("\nColour Name: White.\n");
                     break;
				 
                case 0000:
				
                     System.out.println("\nColour Name: Black.\n");
				     break;
                case 0001:
				
                     System.out.println("\nColour Name: Blue.\n");
                     break;
				
				case 1011:
				
                     System.out.println("\nColour Name: Green.\n");
				     break;
				case 1110:
				
                     System.out.println("\nColour Name: Red.\n");
				     break;
				case 1101:
				
                     System.out.println("\nColour Name: Orange.\n");
				     break;
                case 8888:
			  
				   	 System.exit(0);//For exit to the loop.
				
				default:
			
                    System.out.println("You have enter wrong colour value.\n");
			        break;
				
			}		
		}
    }
}	