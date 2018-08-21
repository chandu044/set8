/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0;
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	char[] ch=s1.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			c++;
		}
	}
	if(c==0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("yes");
	}
	}
}
