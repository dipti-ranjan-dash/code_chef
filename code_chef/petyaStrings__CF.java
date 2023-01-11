
import java.util.*;

public class petyaStrings__CF 
{
    public static void main (String[] args) 
    {


    Scanner sc = new Scanner(System.in);

    String  str1 =sc.nextLine();
    String  str2 =sc.nextLine();

    str1=str1.toLowerCase(Locale.ROOT);
    str2=str2.toLowerCase(Locale.ROOT);

    if(str1.compareTo(str2)==0)
    {
        System.out.println("0");
    }

    else if (str1.compareTo(str2)>0)
    {
        System.out.println("1");
    }
    else
    {
        System.out.println("-1");
    }

sc.close();

    

    }  
}
