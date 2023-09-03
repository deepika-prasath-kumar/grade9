import java.util.*;
public class seriesboolean
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want series till:");
        int n=sc.nextInt();
        boolean neg=false;
        int sum=0;
        for(int t=1;t<=n;t++)
        {
            if(neg==false){
                sum=sum+t;
                neg=true;
            }
            else{
                sum=sum-t;
                neg=false;
            }
        }
        System.out.println(sum);
    }
}