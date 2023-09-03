import java.util.*;
public class prog79
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number you would like reverse of:");
       int n =sc.nextInt();
       int reverse=0;
       do{
           int lastdigit=n%10;
           reverse= reverse*10;
           reverse=reverse+lastdigit;
           n=n/10;
       }
       while(n>0);
       System.out.println(reverse);
    }
}