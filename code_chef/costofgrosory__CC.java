/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class costofgrosory__CC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();

        int a;
        int b;
		
		while(t-->0)
		{
		   int n =s.nextInt();
           int x=s.nextInt();
		   while(n-->0)
           {
                a=s.nextInt();
                b=s.nextInt();

                if(a>=x)
                {
                    System.out.println(b);
                }
           }   
		}
	}
}
