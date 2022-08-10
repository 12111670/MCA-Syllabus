import java.util.Scanner;
class TablesSeries
{
public static void main(String args[])
{
int sr, er, i, j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter starting range:");
sr=sc.nextInt();
System.out.println("Enter ending range:");
er=sc.nextInt();
for(i=sr; i<=er; i++)
{
for(j=1; j<=10; j++)
{
System.out.print((i*j)+" ");
}
System.out.println();
}
}
}