import java.io.*;
public class armstrong2
{
    public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter a number:");
        int n=Integer.parseInt(br.readLine());
        int armstrong=0;
        int r=n;
        while(n!=0){
            int n1=n/10;
            int n2=n%10;
            armstrong=armstrong+n2*n2*n2;
            n=n1;
        }
        if(armstrong==r){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}