import java.util.*;
public class bubble_sort{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the num of elements:");
int n=s.nextInt();
System.out.println("enter the elements:");
int a[]=new int[n];
for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
int t;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n-i-1;j++)
	{
	if(a[j]>a[j+1])
	{
		t=a[j];
		a[j]=a[j+1];
		a[j+1]=t;
	}
	}
	}
	System.out.println("sorted elements:");
	for(int i=0;i<n;i++)
	{
	System.out.print(a[i]+" ");
	}
	}
	}

