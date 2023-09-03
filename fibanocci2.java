import java.io.*;
public class fibanocci2
{
    public static void main()throws Exception
    {
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);
       System.out.println("Enter the number of fibanocci numbers");
       int n=Integer.parseInt(br.readLine());
       int a=1;
       int b=2;
       int fibanocci=0;
       int t=0;
       System.out.print(a+ " ," +b);
       while(t<=n-2){
          fibanocci=a+b;
          a=b;
          b=fibanocci;
          System.out.print(", "+fibanocci);
          t++;
       }
    }
}