import java.util.*;
public class q7
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter c if you want sum of series and enter d if you want odd series");
        String e=sc.next();
        switch(e){
            case "c":
                System.out.println("Enter the number of terms");
                int n=sc.nextInt();
                System.out.println("Enter the value of the denominator");
                int a=sc.nextInt();
                for(int b=1;b<=n;b++){
                    int c=1;
                    double S=c/Math.pow(a,c+1);
                    c=c+3;
                    System.out.println(S);
                }
                break;
        case "d":
                boolean neg=false;
                for(int i=1;i<=19;i++)
                {
                    if(i%2==1)
                    {
                      if(neg==false)
                      {
                          System.out.print(i);
                          neg=true;
                      }
                      else{
                          System.out.print(","+"-"+i+",");
                          neg=false;
                      }
                    }
                }
                break;
            default:
                System.out.println("Please enter c or d to get either series printed");
    }
}
}