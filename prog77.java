import java.util.*;
public class prog77
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number you want product of even numbers till:");
      int n=sc.nextInt();
      int a=1;
      int product=1;
      int c=1;
      do {
          if (a%2==0)
          {
            product=product*a;  
            c++;
          }
          a++;
      } while(c<=n);
      System.out.println(product);
    }
}