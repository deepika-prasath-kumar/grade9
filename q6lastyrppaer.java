//Write a program for the price for the number of copies to be printed...
import java.util.*;
public class q6lastyrppaer{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of copies to be printed:");
        int n = sc.nextInt();
        if(n>=0 && n<=99){
            System.out.println("The price per copy is $0.30");
            System.out.println("The total cost of printing is "+ n*0.30);
        }
        else if(n>=100 && n<=499){
            System.out.println("The price per copy is $0.28");
            System.out.println("The total cost of printing is "+ n*0.28);
        }
        else if(n>=500 && n<=799){
            System.out.println("The price per copy is $0.27");
            System.out.println("The total cost of printing is "+ n*0.27);
        }
        else if(n>=800 && n<=999){
            System.out.println("The price per copy is $0.26");
            System.out.println("The total cost of printing is "+ n*0.26);
        }
        else {
            System.out.println("The price per copy is $0.25");
            System.out.println("The total cost of printing is "+ n*0.25);
        }
        
    }
}