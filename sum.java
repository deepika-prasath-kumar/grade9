import java.util.*;
public class sum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=1;
        int q=0;
        while(n>0)
        {
            int lastdigit=n%10;
            n=n/10;
            sum=sum*lastdigit;
        }
        System.out.println(sum);
    }
}