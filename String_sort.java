import java.util.*;
public class String_sort{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the string size:");
int n=s.nextInt();
String a[]=new String[n];
System.out.println("enter the string elements:");
for(int i=0;i<n;i++)
{
	a[i]=s.next();
}
String t;
System.out.println("sorted elements:");
	for(int i=0;i<n;i++)
	{
	for(int j=i+1;j<n;j++)
	{
	if(a[i].compareTo(a[j])>0)
	{
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	}

	System.out.println(a[i]);
	}
	}
}
