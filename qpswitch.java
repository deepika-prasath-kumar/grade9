import java.util.*;
public class qpswitch
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a for fractional pattern and enter b for fibanocci series:");
        String c=sc.next();
        switch(c){
            case "a":
                {
                    System.out.println("Enter the number of terms");
                    int n=sc.nextInt();
                    System.out.println("Enter the value of a");
                    double a=sc.nextDouble();
                    int d=1;
                    double i=1;
                    double sum=0;
                    while(d<=n){
                       
                       sum=sum+(double)((a+i)/ ++i);
                       
                       d++;
                       i++;
                    }
                    System.out.println("WEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"+ sum);
                }
                break;
            case "b":
                {
                   System.out.println("Enter the number of terms");
                   int n=sc.nextInt();
                   int st=5;
                   int d=1;
                   int a=5;
                   int b=10;
                   int sum=0;
                   System.out.print(a+","+b);
                   while(d<=n)
                   {
                     sum=a+b;
                     System.out.print(","+sum);
                     a=b;
                     b=sum;
                     d++;
                   }
                }
                break;
            default:
                {
                    System.out.println("Please enter a or b");
                }
        }
    }
}