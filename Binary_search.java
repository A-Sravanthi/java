import java.util.*;
public class Binary_search{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no.of elements:");
	int n=s.nextInt();
	System.out.println("enter the elements:");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		}
		System.out.println("enter saerch element:");
		int m=s.nextInt();
		int low=0;
		int high=n-1;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==m)
			{
			System.out.println(m+": element is found at "+mid);
			break;
			}
			else if(a[mid]<m)
			{
			low=mid+1;
			}
			else if(a[mid]>m)
			{
			high=mid-1;
			}
			}
		if(low>high)
		{
		System.out.println("element is not found");
		}
		}
}
