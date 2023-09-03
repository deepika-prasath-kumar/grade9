import java.util.*;
public class switchcase
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number from 1 to 3");
       int a=sc.nextInt();
       switch(a)
       {
           case 1:
               System.out.println("one");    
               break;
           case 2:
               System.out.println("two");    
               break;
           case 3:
               System.out.println("three");    
               break;
           default:
           System.out.println("The number entered is not from 1 to 3");
       }
    }
}