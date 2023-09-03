import java.io.*;
public class qppattern
{
    public static void main()throws Exception{
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);
       System.out.println("Enter the number of rows");
       int r=Integer.parseInt(br.readLine());
       for(int i=1;i<=r;i++){
           for(int j=4;j>=i;j--){
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++){
             if(k%2==0){
               System.out.print("$"); 
             }
             else{
                 System.out.print("#");  
             }
           }
           System.out.println(" ");
       }
    }
}