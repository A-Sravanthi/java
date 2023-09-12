import java.util.*;
public class polindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r,sum=0,i;
int a=n;
while(n>0)
{
r=n%10;
sum=r+sum*10;
n=n/10;
}
if(a==sum)
{
System.out.println(a+" is a polindrome");
}
else
{
System.out.println(a+" is not a polindrome");
}
}
}

