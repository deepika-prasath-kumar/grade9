import java.io.*;
public class q9
{
    public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter your marks for 6 subjects");
        double total=0;
        for(int i=1;i<=6;i++)
        {
            int a=Integer.parseInt(br.readLine());
            total=total+a;
        }
        System.out.println("Total marks="+total);
        System.out.println("Average marks="+ total/6);
        double percentage= (total/(80*6))*100;
        System.out.println("Marks percentage="+percentage);
        if(percentage>80){
            System.out.println("The student is Qualified for Scholarship");
        }
    }
}