import java.util.*;
public class fibonacci
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number till which you want the fibonacci series till");
      int a=sc.nextInt();
      int i=0;
      int b=1;
      int fibonacci = 0;
      System.out.println(i+ " "+ b+ " ");
      for(int c=1;i>1;i++)
      {
           fibonacci = i + b;
            System.out.print(fibonacci + " ");
            i = b;
            b = fibonacci;
      }
    }
}