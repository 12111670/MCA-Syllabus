// WAP to create a table of a given number.
// Store the table into an array
// Print the array

import java.util.Scanner;
class TableArray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i;
int a[]=new int[10];
System.out.println("Enter any number:");
n=sc.nextInt();
for(i=1; i<=10; i++)
{
a[i-1]=(n*i);
}
for(i=0; i<10; i++)
System.out.println(a[i]);

}
}