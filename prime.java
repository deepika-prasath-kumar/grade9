import java.util.*;
public class prime
{
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number");
       int a=sc.nextInt();
       int c=0;
       for (int b=2; b<a; b++)
       { 
           if(a%b==0)
           {
               System.out.println("It is not prime");
               c=1;
               break;
           }
       }
       if(c==0)
       {
           System.out.println("It is prime");
       }
        
    }
}