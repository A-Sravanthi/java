import java.util.*;
public class linearsearch{
public static void main(String agrs[]){
Scanner sc=new Scanner(System.in);
int n,i,k,f=0;
System.out.println("enter the num of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

System.out.println("enter the search of element:");
k=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==k)
{
f++;
break;
}
}
if(f==1)
{
System.out.println("element found");
}
else
System.out.println("not found");
}
}

