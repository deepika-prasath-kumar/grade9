import java.util.*;
public class input
{
    public static void main(String[]args)
    {
     Scanner sc= new Scanner(System.in);
     double a,b; 
     System.out.println("Enter a number ");
     a=sc.nextDouble();
     System.out.println("Enter a number ");
     b=sc.nextDouble();
     double sum=a+b;
     System.out.println("The sum of the 2 numbers entered is "+sum);
    }
}