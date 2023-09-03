import java.io.*;
public class oddeven
{
    public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter the amount of natural numbers you would like sum of odd or even till");
        int x=Integer.parseInt(br.readLine());
        int sum_odd=0;
        int a=1;
        int sum_e=0;
        while (a<=x)
        {
            if(a%2==0)
            {
              sum_e=sum_e+a;  
            }
            else
            {
                sum_odd=sum_odd+a;
           }
           a++;
        }
        System.out.println("The sum of even is  "+sum_e);
        System.out.println("The sum of odd is  "+sum_odd);
    }
}