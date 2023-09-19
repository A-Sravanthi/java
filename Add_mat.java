import java.util.*;
public class Add_mat{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the  no.of rows and columns first matrix:");
int r1=s.nextInt();
int c1=s.nextInt();
System.out.println("enter the no.of rows and columns second matrix:");
int r2=s.nextInt();
int c2=s.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int i,j;
int c[][]=new int[10][10];
System.out.println("enter the  first matrix elements:");
for(i=0;i<r1;i++)
{
	for(j=0;j<c1;j++)
	{
	 a[i][j]=s.nextInt();
	}
}
System.out.println("enter the  second matrix elements:");
for(i=0;i<r2;i++)
{
	for(j=0;j<c2;j++)
	{
	 b[i][j]=s.nextInt();
	}
}
for(i=0;i<r1;i++)
{
	for(j=0;j<c1;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
	}
}
for(i=0;i<r1;i++)
{
	for(j=0;j<c1;j++)
	{
	System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
}
}


