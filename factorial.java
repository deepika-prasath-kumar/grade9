import java.io.*;
public class factorial
{
    public static void main()throws Exception
    {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     System.out.println("Enter a number:");
     int n=Integer.parseInt(br.readLine());
     int factorial=1;
     int i=1;
     while(i<=n){
         factorial=factorial*i;
         i++;
     }
     System.out.println(factorial);
    }
}