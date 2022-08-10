import java.util.Scanner;
class electricityBill
{
    void domastic()
    {  int charge=0;
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter your total units:");
       int unit=sc.nextInt();
       	unit=unit-100;
        charge=unit*8+250;
       System.out.println("Your Bill is: "+charge);
    }
    void commercial()
    {
      int charge=0;
	  Scanner sc =new Scanner(System.in);
      System.out.println("Enter you total units:");
	  int unit=sc.nextInt();
      unit=unit-300;
      charge=unit*15+1000;
      System.out.println("Your Bill is: "+charge);
	}	  
	public static void main(String args[])
	{ 
	    electricityBill e=new electricityBill();
		System.out.println("\n1.Domastic\n2.Commercial\n3.Exit.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you choice:");
		int choice=sc.nextInt();
		while(choice>=0)
		{
            switch(choice)
            {
                case 1:
				{
                     e.domastic();
                     break;
				} 
                case 2:
				{
                     e.commercial();
				}    break;
                case 3:
				{
                     System.exit(0);
                     break;
				}	 
                default:
				{
                    System.out.println("You have enter wrong choice.");
			        break;
				}
			}		
		};
    }
}	