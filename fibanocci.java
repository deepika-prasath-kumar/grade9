import java.io.*;
public class fibanocci{
    public static void main()throws Exception
    {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      System.out.println("Enter a number you want fibanocci series till:");
      int n= Integer.parseInt(br.readLine());
      int r=1;
      int a=1;
      int b=2;
      int fibanocci;
      System.out.print(a+ ","+ b);
      while(r<=n-2){
          fibanocci=a+b;
          System.out.print(","+fibanocci);
          a=b;
          b=fibanocci;
          r++;
      }
    }
}