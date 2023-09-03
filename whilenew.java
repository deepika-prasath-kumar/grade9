import java.io.*;
public class whilenew
{
    public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the natural number you would like the sum till ");
        int x=Integer.parseInt(br.readLine()); //while loop, first intialize the variables, then do the condtion with while(), then do the body inside {}
        int i=1;
        int sum=0;
        while(i<=x)
        {
         sum=sum+i;
         i++;
        }
        System.out.println("The sum of the natural numbers u entered are"+sum);
    }
}