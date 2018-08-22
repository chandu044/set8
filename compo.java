import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,c,fact=0,i;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			c=a%i;  
			if(c==0)
			{
				fact=fact+1;
			}
			
		}
		if(fact==2)
		{
		System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
