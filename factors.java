import java.util.*;
public class factors
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++)
        {
            if(n%a==0)
            {
                if(a==n)
                {
                    System.out.print(a);
                }
                else{
                    System.out.print(a+",");
                }
        }
    }
    }
}