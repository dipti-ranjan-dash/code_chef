 


import java.util.Scanner;

public class age60__CC {
    public static void main(String[] args) 
    {
        int ladies;

        


        Scanner sc = new Scanner(System.in);
        
          System.out.println("the number of ladies ");

          ladies=sc.nextInt();

          int age[]= new int [ladies];

          System.out.println("the age of ladies ");



          for(int i =0; i<ladies ; i++)
          {
                 age[i]=sc.nextInt();

          }

            int count =0 ;

            for (int j = 0; j<ladies;j++)
            {

                if(age[j]>=10 && age[j]<=60)
                {
                    count++;
                }
            }
                 System.out.println(count);
    }

}

