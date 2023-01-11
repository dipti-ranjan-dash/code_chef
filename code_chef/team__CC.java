import java.util.Scanner;

public class team__CC {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();

         int ans=b-a;
         int ansc=2*c;


         if (ans <= ansc) 
         {
              System.out.println("yes");            
         }
         else{
            System.out.println("no");            

         }
    }

}


// /* code kyu dekh raha apna apna try kar */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int t=sc.nextInt();
// 		for(int i=1;i<=t;i++)
// 		{
// 		    int women=sc.nextInt();
// 		    int age[]= new int[women];
// 		    for(int j=0;j<women;j++)
// 		    {
// 		        age[j]=sc.nextInt();
// 		    }
// 		    int count=0;
// 		    for(int k=0;k<women;k++)
// 		    {
// 		        if(age[k]>=60 && age[k]!=60)
// 		        {
// 		            count++;
// 		        }
// 		    }
// 		    System.out.println(count);
// 		}
// 	}
// }
