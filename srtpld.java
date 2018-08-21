/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0,i,j;
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		char[] a=s1.toCharArray();
	           int k=s1.length();
		j=s1.length()-1;

		for(i=0;i<s1.length();i++,j--)
		{
			if(a[i]==a[j])
			{
				c++;
			}
		}
		if(k!=c)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
			
            }
}
