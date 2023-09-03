import java.io.*;
public class fornew
{
    public static void main()throws Exception
    {
      InputStreamReader isr= new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      System.out.println("Enter the number you want squares till");
      int x=Integer.parseInt(br.readLine());
      for(int i=1; i<=x; i++)
      {
          System.out.println(Math.pow(i,2));
      }
    }
}