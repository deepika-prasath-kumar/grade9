import java.io.*;
public class newtype
{
    public static void main()throws Exception
    {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter a number");
        int i=Integer.parseInt(br.readLine());
        System.out.println("The value entered is " + i);
    }
}


