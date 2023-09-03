import java.util.*;
public class evenodd
{
    public static boolean mom(int a)
    {
        if (a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a digit");
       int a=sc.nextInt();
       if(mom(a)==true)
       {
           System.out.println("The number is even");
       }
       else
       {
          System.out.println("The number is odd"); 
       }
    }
}
