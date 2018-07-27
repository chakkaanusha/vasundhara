/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int l,h;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		h=sc.nextInt();
		while(l<h)
		{
			boolean flag=true;
			for(int i=2;i<=l;++i)
			{
				if(l%i==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println(l+ " ");
				++l;
			}
		}
	}
}

				
			
		
	
