import java.util.*;
public class median
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 digits");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int median1;
        if((a>b && a<c)|| (a<b && a>c))
        {
          System.out.println("The median is"+a);  
        }
        else if((b<a && b>c)||( b<c && b>a))
        {
            System.out.println("The median is"+b);  
        }
        else
        {
            System.out.println("The median is"+c);  
        }
    }
}