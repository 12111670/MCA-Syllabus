import java.util.Scanner;
class TablesTwoDarray
{
public static void main(String args[])
{
int sr, er, i, j, rs, k=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter starting range:");
sr=sc.nextInt();
System.out.println("Enter ending range:");
er=sc.nextInt();
rs=(er-sr)+1;
int a[][]=new int[rs][10];
for(i=sr; i<=er; i++)
{
for(j=1; j<=10; j++)
{
a[k][j-1]=(i*j);
}
k++;
}
k=0;
for(i=sr; i<=er; i++)
{
for(j=1; j<=10; j++)
{
System.out.print(" "+a[k][j-1]);
}
k++;
System.out.println();
}

}
}