import java. io.*;
public class practise
{
public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter a number");
        int a= Integer.parseInt(br.readLine());
        int sum=0;
        int product=1;
        int i;
        if(a%2==0)
        {
            for(i=2; i<=(a/2); i++)
            {
                {
                    sum=sum +1;
                }
            }
            int finalsum=1+a+sum;
            System.out.println ("The sum of all factors is"+ finalsum);
        }
        else
        {
            for (i=2;i<=a/2;i++)
            {
                {
                    product=product*1;
                }
                
            }
            int finalproduct=1*a*product;
            System.out.println("The product of all factors is"+finalproduct);
        }
       
    }
}