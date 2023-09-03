import java.util.*;
public class CI
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal ");
        double p=sc.nextDouble();
        System.out.println("Enter the rate ");
        double r=sc.nextDouble();
        System.out.println("Enter the amount of time ");
        double t=sc.nextDouble();
        double amount=p*Math.pow((1+r/100),2);
        System.out.println("The total amount is "+amount);
        double CI=amount-p;
        System.out.println("The compound intrest is "+CI);
    }
}