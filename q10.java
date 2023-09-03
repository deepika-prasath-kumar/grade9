import java.util.*;
public class q10
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find whether it is supernatural or not");
        int i=sc.nextInt();
        int j=0;
        for(int n=0;n<=i;n++)
        {
            if(n*(n+1)==i){
                System.out.println("Supernatural Number");
                j++;
            }
        }
        if(j==0){
            System.out.println("Not a supernatural number");
        }
    }
}