import java.util.*;
public class ternary
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int a=sc.nextInt();
       int absolute=a<0?-a:a;
       System.out.println("The absolute value of the number is"+absolute);
    }
}