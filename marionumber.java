import java.util.*;
public class marionumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0;
        int n2=0;
        int flag=0;
        while(n!=0)
        {
            n1=n/10;
            n2=n%10;
            int n3, n4;
            while(n1!=0)
            {
                n3=n1/10;
                n4=n1%10;
                if(n2==n4){
                    System.out.println("It is not a mario number");
                    flag = 1;
                    break;
                }
                n1=n3;
            }
            n = n/10;
        }
        if (flag == 0)
        {
            System.out.println("It is a mario number");
        }
    }
    }
