import java.util.*;
public class revwvalue
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int remainder;
       int rev=1; 
       while(n!=0)
       {
           remainder=n%10;
           rev= (rev *10)+remainder;
           n=n/10;
       }
       System.out.println("The reverse is"+ rev); 
       
    }
}