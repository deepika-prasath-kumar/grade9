import java.util.*;
public class postivenegative
{
    public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int a=sc.nextInt();
     if(a<0)
     {
         System.out.println("The number is negative");
     }
     else if (a==0)
     {
        System.out.println("The number is neither negative nor postive, it is 0"); 
     }
     else
     {
         System.out.println("The number is postive");
     }
    }
}