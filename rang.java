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
		int n=s.nextInt();
		int l=s.nextInt();
		int r=s.nextInt();
		if(n>l&&n<r)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
