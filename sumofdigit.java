import java.util.*;
public class sumofdigit
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int sum=0;
       while(n!=0){
           int n1=n/10;
           int n2=n%10;
           sum=sum+n2;
           n=n1;
       }
       System.out.println(sum);
    }
}