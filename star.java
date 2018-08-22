/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		char[] a=s1.toCharArray();
		int b=s1.length();
		int c=b%2;
		int d=b/2;
		if( c==0)
		{
			a[d]='*';
			a[d-1]='*';
			for(int i=0;i<b;i++)
			{
				System.out.print(a[i]);
			}
		}
		else
		{
			a[d]='*';
			for(int i=0;i<b;i++)
			{
				System.out.print(a[i]);
			}
		}
	}
}
