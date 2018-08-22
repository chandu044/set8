/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,b=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	            int  m=s.nextInt();
	            int k=m*n;
	            for(int i=1;i<k/2;i++)
	            {
	                a=i*i;
	                if(a==k)
	                {
	                b++;	
	                }
	            }
	            if(b!=0)
	            {
	            	System.out.print("yes");
	            }
	            else 
	            System.out.print("no");
	}
}
