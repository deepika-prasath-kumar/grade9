import java.util.*;
public class prog78
{
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number you want the factorial of:");
       int n=sc.nextInt();
       int a=1;
       int fact=1;
       do{
           fact=fact*a;
           a++;
       }
       while(a<=n);
       System.out.println(fact);
    }
}