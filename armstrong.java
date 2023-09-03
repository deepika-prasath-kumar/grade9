import java.util.*;
public class armstrong
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        int o=n;
        while(n!=0)
        {
            int n1=n/10;
            int n2=n%10;
            j=j+n2*n2*n2;
            n=n1;
        }
        if(j==o){
        System.out.println(j);
    }
    else{
        System.out.println("The number is not a armstrong");
    }
    
    }
}