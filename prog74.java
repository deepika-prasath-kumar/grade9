import java.util.*;
public class prog74
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbers you want odd numbers until");
       int n=sc.nextInt();
       int a=1;
       do{
           if(a%2!=0)
           {
               System.out.println(a);
           }
           a++;
       }
       while(a<=n);
    }
}