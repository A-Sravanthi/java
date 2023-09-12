import java.lang.*;
import java.util.*;
public class quad{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	float a,b,c;
	a=sc.nextFloat(); 
	b=sc.nextFloat(); 
	c=sc.nextFloat(); 
	double r1,r2;
	double val=b*b-4*a*c;
	if(val>0)
	{
		System.out.println("real roots:");
		r1=((-b+Math.sqrt(b*b-(4*a*c)))/2*a);
		r2=((-b-Math.sqrt(b*b-(4*a*c)))/2*a);
		System.out.println("root1:"+r1+" root2:"+r2);
		}
	else if(val<0)
	{
		System.out.println("imaginary roots:");
		r1=((-b+Math.sqrt(val))/(2*a));
		r2=((-b-Math.sqrt(val))/(2*a));
		System.out.println("root1: i"+r1+" root2: i"+r2);
		}
	else
	{
		System.out.println("equal roots:");
		r1=(-b/2*a);
		r2=(-b/2*a);
		System.out.println("root1:"+r1+" root2:"+r2);
		}
	}
}


