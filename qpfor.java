import java.util.*;
public class qpfor
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           int k=1;
           for(k=1;k<=(n-i);k++)
           {
               System.out.print(" ");
           }
           for(int j=k;j<=n;j++)
           {
              if(j%2==0)
              {
                  System.out.print("$");
              }
              else{
                 System.out.print("#");
              }
           }
           System.out.println();
        }
    }
}