import java.util.*;
public class ifloop
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter the first number");
      a=sc.nextInt();
      System.out.println("Enter the second number");
      b=sc.nextInt();
      if(a>b)
      {
         System.out.println("The first number entered is bigger than the second number");
      }
      if(a<b)
      {
          System.out.println("The second number is bigger than the first number");
      }
      if(a==b)
      {
          System.out.println("The 2 numbers are equal");
      }
    }
}